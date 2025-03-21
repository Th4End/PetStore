package fr.epsi.b3c2.petshop;

import fr.epsi.b3c2.petshop.entity.*;
import fr.epsi.b3c2.petshop.repository.AddressRepository;
import fr.epsi.b3c2.petshop.repository.AnimalRepository;
import fr.epsi.b3c2.petshop.repository.PetStoreRepository;
import fr.epsi.b3c2.petshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class PetShopApplication implements CommandLineRunner {

    @Autowired
    private PetStoreRepository petStoreRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            //Instanciation des données de la table address
            Address address = new Address("233", "Rte de Vannes Lot 3", "Saint-Herblain", "44800");
            Address address1 = new Address("6-8", "Rue Marc Elder rue de", "Rezé", "44400");
            Address address2 = new Address("15bis", "Avenue de Vertonne", "Vertou", "44120");
            addressRepository.save(address);
            addressRepository.save(address1);
            addressRepository.save(address2);

            //Instanciation des données de la table petstore
            PetStore petStore = new PetStore();;
            petStore.setName("Animalis");
            petStore.setManagerName("Alice Dupont");
            petStore.setAddress(address);
            petStoreRepository.save(petStore);

            PetStore petStore1 = new PetStore();
            petStore1.setName("Maxi Zoo Rezé");
            petStore1.setManagerName("Antoine Daniel");
            petStore1.setAddress(address1);
            petStoreRepository.save(petStore1);

            PetStore petStore2 = new PetStore();
            petStore2.setName("Animal Valley");
            petStore2.setManagerName("Alice Valley");
            petStore2.setAddress(address2);
            petStoreRepository.save(petStore2);

            //Instanciation des données de la table animal
            Fish fish = new Fish();
            fish.setColors("gold");
            fish.setPetStore(petStore);
            fish.setFishLivEnv(FishLivEnv.FRESH_WATER);
            fish.setBirth(Date.valueOf("2024-11-12"));
            animalRepository.save(fish);

            Cat cat = new Cat();
            cat.setChipId("1");
            cat.setBirth(Date.valueOf("2003-08-11"));
            cat.setColors("orange");
            cat.setPetStore(petStore1);
            animalRepository.save(cat);

            Cat cat1 = new Cat();
            cat1.setChipId("2");
            cat1.setBirth(Date.valueOf("2003-10-14"));
            cat1.setColors("black");
            cat1.setPetStore(petStore2);
            animalRepository.save(cat1);

            //Instanciation des données de la table product
            Product product = new Product();
            product.setCode("355PM");
            product.setLabel("Pâté pour chat");
            product.setPrice(11.99);
            product.setType(ProdType.FOOD);
            product.setStore(petStore);
            productRepository.save(product);

            Product product1 = new Product();
            product1.setCode("445");
            product1.setLabel("Château d'aquarium");
            product1.setPrice(13.50);
            product1.setType(ProdType.ACCESSORY);
            product1.setStore(petStore1);
            productRepository.save(product1);

            Product product2 = new Product();
            product2.setCode("555");
            product2.setLabel("Litière");
            product2.setType(ProdType.CLEANING);
            product2.setStore(petStore2);
            productRepository.save(product2);

            //récupération des produit de la table product pour le code 355PM
            List<Product> products = productRepository.findByCode("355PM");
            products.forEach(Product -> System.out.println(product.getLabel()));

            //Requête de récupération des animaux en fonction du petstore
            List<Animal> animals = animalRepository.findByPetStore(petStore1.getId());
            animals.forEach(Animal -> System.out.println(Animal.getAnimalType()));

        } catch (Exception e) {
            System.out.println("KO");
            e.printStackTrace();
        }
    }
}
