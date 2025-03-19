package fr.epsi.b3c2.petshop.repository;

import fr.epsi.b3c2.petshop.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
