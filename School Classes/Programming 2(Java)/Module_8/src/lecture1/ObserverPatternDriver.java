package lecture1;

public class ObserverPatternDriver {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		
		Observer weatherDisplay = new WeatherDisplay();
		Observer mobileApp = new MobileApp();
		
		weatherStation.addObserver(mobileApp);
		weatherStation.addObserver(weatherDisplay);
		
		//simulation temp change
		weatherStation.setTemperature(25.0f);
		System.out.println();
		
		//again
		weatherStation.setTemperature(30.0f);
		System.out.println();
		
		//unregister an observer
		weatherStation.setTemperature(33.0f);
		weatherStation.removeObserver(mobileApp);
		
		System.out.println();
		System.out.println("Mobile observer removed.");
		
		weatherStation.setTemperature(34.0f);
	}

}
