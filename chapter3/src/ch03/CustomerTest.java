package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerChoi = new Customer(10001, "??ġ??");
		customerChoi.bonusPoint = 1000;
		System.out.println(customerChoi.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "???ҿ?");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noName");
		
	}

}
