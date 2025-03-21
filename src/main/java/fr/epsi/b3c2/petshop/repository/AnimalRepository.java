package fr.epsi.b3c2.petshop.repository;

import fr.epsi.b3c2.petshop.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM Animal a WHERE a.petstore.id = :petStoreId")
    List<Animal> findByPetStore(@Param("petStoreId") Long petStoreId);
}
