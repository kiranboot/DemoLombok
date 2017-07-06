package com.example.kcp.address;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class AddressController {

	@RequestMapping("/addresses")
	public List<Address> getAllAddress() {
		log.info("\n \nList all Addresses");
		Address a1 = new Address("1","Wilmington","DE");
		Address a2 = new Address("2", "Bear", "DE");
		Address[] addArray = new Address[]{a1, a2};
		System.out.println("List all Addresses");
		return Arrays.asList(addArray);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/address/{id}")
	public Address getAddress(@PathVariable String id) {
		return new Address();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/address")
	public void addAddress(@RequestBody Address business) {
		System.out.println("Address Added");
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/address/{id}")
	public void updateAddress(@RequestBody Address business, @PathVariable String id) {
		System.out.println("Address updated");
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/address/{id}")
	public void deleteAddress(@PathVariable String id) {
		System.out.println("Address deleted");
	}

}
