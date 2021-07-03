package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerChoi = new Customer(10001, "최치원");
		customerChoi.bonusPoint = 1000;
		System.out.println(customerChoi.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "김소운");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noName");
		
	}

}
