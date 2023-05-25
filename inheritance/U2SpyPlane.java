package inheritance;

public class U2SpyPlane extends plane {

	int wingsSpan;
	//Setter and Getter for the WingsSpan
	public int getWingsSpan() {
		return wingsSpan;
	}


	public void setWingsSpan(int wingsSpan) {
		this.wingsSpan = wingsSpan;
	}


	U2SpyPlane(int speed, String color, int price, int wingsSpan) {
		super(speed, color, price, wingsSpan);
		this.wingsSpan = wingsSpan;
	}
	
	
	@Override
	void Fly(){
		System.out.println("The U-2 Spy Plane is Flying");
	}
}
