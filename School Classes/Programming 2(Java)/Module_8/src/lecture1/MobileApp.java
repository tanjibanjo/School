package lecture1;

public class MobileApp implements Observer{
	public void update(float temperature) {
		System.out.println("Mobile App: Changed temperature to " + temperature);
	}

}
