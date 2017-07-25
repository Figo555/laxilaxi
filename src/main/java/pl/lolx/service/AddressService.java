package pl.lolx.service;

import java.util.List;

import pl.lolx.model.Address;

public interface AddressService {
	List<Address> addressList();
	
	Address findOne(Long id);
	
	Address addAddress(Address address);
	
	String deleteAddress(Long id);
}
