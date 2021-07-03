package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerChoi = new Customer();
		customerChoi.setCustomerName("최치원");
		customerChoi.setCustomerID(10001);
		customerChoi.bonusPoint = 1000;
		System.out.println(customerChoi.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김소운");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
