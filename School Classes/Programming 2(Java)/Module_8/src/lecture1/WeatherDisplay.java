package lecture1;

public class WeatherDisplay implements Observer{
	public void update(float temperature) {
		System.out.println("WeatherDisplay: Temperature changed to " + temperature);
	}

}
