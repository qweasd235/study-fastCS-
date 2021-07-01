package ch08;

public class send {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.setOrderNumber("202011020003");
		order.setPhoneNumber("01023450001");
		order.setOrderAddress("서울시 강남구 역삼동 111-333");
		order.setOrderDate("20201102");
		order.setOrderHour("130258");
		order.setPrice(35000);
		order.setMenuNumber(0003);
		
		order.orderNumber();
		order.phoneNumber();
		order.orderAddress();
		order.orderDate();
		order.orderHour();
		order.price();
		order.menuNumber();
	}

}
