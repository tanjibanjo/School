package lecture3;

public class BeverageMain {

	public static void main(String[] args) {
		//local variables
		CaffeineBeverage coffee = new Coffee();
		CaffeineBeverage tea = new Tea();
		
		System.out.println("Making Coffee");
		coffee.prepareRecipe();
		
		System.out.println("Making tea");
		tea.prepareRecipe();

	}

}
