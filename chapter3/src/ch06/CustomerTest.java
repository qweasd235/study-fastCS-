package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		
		Customer customerC = new Customer(10010, "최충헌");
		Customer customerK = new Customer(10020, "김율");
		Customer customerG = new GoldCustomer(10030, "강촌");
		Customer customerP = new GoldCustomer(10040, "박촌");
		Customer customerS = new VIPCustomer(10050, "성촌");
		
		
		customerList.add(customerC);
		customerList.add(customerK);
		customerList.add(customerG);
		customerList.add(customerP);
		customerList.add(customerS);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는  " + customer.bonusPoint + "점입니다.");
		}
		
	}

}
