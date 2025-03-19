package fr.epsi.b3c2.petshop.repository;

import fr.epsi.b3c2.petshop.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
