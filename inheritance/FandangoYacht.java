package inheritance;

public class FandangoYacht extends boat {

	String MainSailColor;
	//Setter and Getter for the Main Sail Color
	public String getMainSailColor() {
		return MainSailColor;
	}
	public void setMainSailColor(String mainSailColor) {
		MainSailColor = mainSailColor;
	}
	FandangoYacht(int speed, String color, int price,String MainSailColor) {
		super(speed, color, price);
		this.MainSailColor = MainSailColor;
		
	}
	//Overriding the float method
	@Override
	void Float () {
		System.out.println("The Fandango Yacht is floating");
	}
}
