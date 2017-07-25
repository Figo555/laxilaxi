package pl.lolx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.lolx.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
