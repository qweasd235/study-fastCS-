package ch08;

public class Order {
	
	private String orderNumber;
	private String phoneNumber;
	private String orderAddress;
	private String orderDate;
	private String orderHour;
	public String getOrderHour() {
		return orderHour;
	}
	public void setOrderHour(String orderHour) {
		this.orderHour = orderHour;
	}
	private int price;
	private int menuNumber;
	
	
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMenuNumber() {
		return menuNumber;
	}
	public void setMenuNumber(int menuNumber) {
		this.menuNumber = menuNumber;
	}
	
	public void orderNumber() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
	}
	
	public void phoneNumber() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
	}
	public void orderAddress() {
		System.out.println("�ֹ� �� �ּ� : " + orderAddress);
	}
	public void orderDate() {
		System.out.println("�ֹ� ��¥ : " + orderDate);
	}
	public void orderHour() {
		System.out.println("�ֹ� �ð� : " + orderHour);
	}
	public void price() {
		System.out.println("�ֹ� ���� : " + price);
	}
	
	public void menuNumber() {
		System.out.println("�޴� ��ȣ : " + menuNumber);
	}
	
}
