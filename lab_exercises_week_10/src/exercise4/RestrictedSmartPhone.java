package exercise4;
public class RestrictedSmartPhone extends SmartPhone{
	private boolean parentAllows = false;
	
	@Override
	public void playGame(String title){
		if (parentAllows){
			super.playGame(title);
		}
		else {
			System.out.println("Denied. You cannot play " + title);
		}
	}
}