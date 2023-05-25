package inheritance;

public class main {

	public static void main(String[] args) {
		
		// Code for A
		
		ToyotaVios Vios = new ToyotaVios(100,"Blue",5000000,"All-Season Tire");
		System.out.println("TOYOTA VIOS");
		System.out.println("Speed: "+ Vios.speed);
		System.out.println("Color: "+ Vios.color);
		System.out.println("Price: "+ Vios.price +"$");
		System.out.println("Tire: "+ Vios.tire);
		Vios.drive();
		Vios.Stop();
		
		U2SpyPlane Spyplane = new U2SpyPlane(100,"Red",500000,20);
		System.out.println("");
		System.out.println("U-2 SPY PLANE");
		System.out.println("Speed: "+ Spyplane.speed);
		System.out.println("Color: "+ Spyplane.color);
		System.out.println("Price: "+ Spyplane.price +"$");
		System.out.println("Wings Span: "+ Spyplane.wingsSpan);
		Spyplane.Fly();
		Spyplane.Stop();

		FandangoYacht Fandango = new FandangoYacht(100,"Yellow",500000,"Rainbow");
		System.out.println("");
		System.out.println("FANDANGO YACHT");
		System.out.println("Speed: "+ Fandango.speed);
		System.out.println("Color: "+ Fandango.color);
		System.out.println("Price: "+ Fandango.price +"$");
		System.out.println("Wings Span: "+ Fandango.MainSailColor);
		Fandango.Float();
		Fandango.Stop();

}
}
