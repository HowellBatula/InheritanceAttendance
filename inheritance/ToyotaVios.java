package inheritance;

public class ToyotaVios extends car{

	String tire;
	
	public String getTire() {
		return tire;
	}

	public void setTire(String tire) {
		this.tire = tire;
	}

	ToyotaVios(int speed, String color, int price, String tire) {
		super(speed, color, price);
		this.tire = tire;
		
	}
	
	void drive() {
		System.out.println("The Toyota Vios is Driving");
	}
}
