package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		
		Customer customerC = new Customer(10010, "������");
		Customer customerK = new Customer(10020, "����");
		Customer customerG = new GoldCustomer(10030, "����");
		Customer customerP = new GoldCustomer(10040, "����");
		Customer customerS = new VIPCustomer(10050, "����");
		
		
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
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ��  " + customer.bonusPoint + "���Դϴ�.");
		}
		
	}

}
