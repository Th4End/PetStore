package fr.epsi.b3c2.petshop.repository;

import fr.epsi.b3c2.petshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
