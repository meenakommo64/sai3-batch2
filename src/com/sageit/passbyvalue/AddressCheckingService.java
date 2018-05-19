package com.sageit.passbyvalue;

public class AddressCheckingService {

	public AddressCheckingService() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkAddress() {

		Address dallasAddress = new Address();

		dallasAddress.setCity("Dallas");
		dallasAddress.setState("TX");
		dallasAddress.setStreetNo("Collin dr");
		dallasAddress.setZipcode(12345);

		boolean status = false;

		System.out.println("before status is ...." + status + "zip code is .." + dallasAddress.getZipcode());
		
		status = getAddressDetails(dallasAddress, status);

		System.out.println("after status is ...." + status + "zip code is .." + dallasAddress.getZipcode());

		return status;

	}

	public boolean getAddressDetails(Address address, boolean status) {

		if (address.getZipcode().intValue() > 1000) {
			address.setZipcode(10000);
			status = true;
		}
		
		return status;

	}

	public static void main(String arg[]) {
		AddressCheckingService acs = new AddressCheckingService();
		acs.checkAddress();
	}

}
