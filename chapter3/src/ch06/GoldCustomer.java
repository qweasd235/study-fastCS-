package ch06;

public class GoldCustomer extends Customer {
	
	double salesRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
	
		customerGrade = "GOLD";
		bonusPoint = 0.02;
		salesRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
