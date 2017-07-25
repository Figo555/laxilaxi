package pl.lolx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.lolx.model.Address;
import pl.lolx.repository.AddressRepository;
import pl.lolx.repository.UserRepository;
import pl.lolx.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	private AddressRepository addressRepository;

	private UserRepository userRepository;
	
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
		this.addressRepository = addressRepository;
		this.userRepository = userRepository;
	}

	@Override
	public List<Address> addressList() {
		return addressRepository.findAll();
	}

	@Override
	public Address findOne(Long id) {
		return addressRepository.findOne(id);
	}

	@Override
	public Address addAddress(Address address) {
		address.setUser(userRepository.findOne(address.getUserId()));
		return addressRepository.save(address);
	}

	@Override
	public String deleteAddress(Long id) {
		addressRepository.delete(id);
		return "{'message':'Address deleted succesfully.'}";
	}
	
	
}
