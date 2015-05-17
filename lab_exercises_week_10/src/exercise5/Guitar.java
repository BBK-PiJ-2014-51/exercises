package exercise5;

public class Guitar implements MusicalInstrument, WoodenObject{

	@Override
	public void burn() {
		System.out.println("The guitar is burning");
		
	}

	@Override
	public void play() {
		System.out.println("da da da da");	
	}

}