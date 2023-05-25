package inheritance;

public class car extends vehicle {
	

	car(int speed, String color, int price) {
		super(speed, color, price);
	}

	void drive() { 
		System.out.println("The car is Driving");
	}

}
