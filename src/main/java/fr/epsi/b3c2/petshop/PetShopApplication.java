package fr.epsi.b3c2.petshop;

import fr.epsi.b3c2.petshop.entity.*;
import fr.epsi.b3c2.petshop.repository.AddressRepository;
import fr.epsi.b3c2.petshop.repository.AnimalRepository;
import fr.epsi.b3c2.petshop.repository.PetStoreRepository;
import fr.epsi.b3c2.petshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class PetShopApplication implements CommandLineRunner {

    @Autowired
    private PetStoreRepository petStoreRepository;
    private AddressRepository addressRepository;
    private AnimalRepository animalRepository;
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {


            Address address = new Address("233", "Rte de Vannes Lot 3", "Saint-Herblain", "44800");
            PetStore petStore = new PetStore();
            petStore.setName("Animalis");
            petStore.setManagerName("Alice Dupont");
            petStore.setAddress(address);
            petStoreRepository.save(petStore);

            Animal animal = new Animal();
            animal.setBirth("14-01-2009");
            animal.setColors("black");
            animal.setPetStore(petStore);
            animalRepository.save(animal);

            Address address1 = new Address();
            address1.setCity("Saint-Herblain");
            address1.setNumber("233");
            address1.setZip("44800");
            address1.setCity("Rte de Vannes Lot 3");
            addressRepository.save(address1);

            Product product = new Product();
            product.setLabel("Pâté pour chat");
            product.setPrice(11.99);
            product.setType(ProdType.FOOD);
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println("KO");
            e.printStackTrace();
        }
    }
}
