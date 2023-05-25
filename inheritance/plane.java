package inheritance;

public class plane extends vehicle{

	plane(int speed, String color, int price,int wingsSpan) {
		super(speed, color, price);
			
	}
	
	void Fly() {
		System.out.println("The Airplane is Flying");
	}
}
