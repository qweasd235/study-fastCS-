package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Student Edward = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘 간다 운수택시");
		
		Edward.takeTexi(taxi);
		
		Edward.showInfo();
		taxi.showTaxiInfo();
	}

}
