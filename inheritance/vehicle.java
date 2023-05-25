package inheritance;

public class vehicle {

	int speed;
	String color;
	int price;
	//Setter and Getter for the Properties
	public int getSpeed() {
	return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	vehicle(int speed,String color,int price){
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	public void Stop() {
		System.out.println("Stop");
	}
}
