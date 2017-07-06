package com.example.kcp.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class Address {

	private String addressId;
	private String city;
	private String state;

}
