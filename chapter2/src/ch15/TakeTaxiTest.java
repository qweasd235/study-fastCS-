package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Student Edward = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("�� ���� ����ý�");
		
		Edward.takeTexi(taxi);
		
		Edward.showInfo();
		taxi.showTaxiInfo();
	}

}
