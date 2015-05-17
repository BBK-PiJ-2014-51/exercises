package exercise1;
public class MobilePhone extends OldPhone{
	public static final int numbersSaved = 10;
	private int[] lastTenNumbers = new int[numbersSaved];
	private int lastSavedNumber = 0;
	
	public MobilePhone(){
		initArray();
	}
	
	@Override
	public void call(String number) {
		System.out.println("Calling " + number);
		lastTenNumbers[lastSavedNumber++] = Integer.parseInt(number);
		if (numbersSaved == lastSavedNumber) lastSavedNumber = 0;
	}
	
	public void ringAlarm(String ringtone){
		System.out.println(ringtone);
	}
	
	public void playGame(String title){
		System.out.println("Launching " + title);
	}
	
	public void printLastTenNumbers(){
		for (int i = 0; i < numbersSaved; i++){
			System.out.println(String.valueOf(lastTenNumbers[i]));
		}
	}
	
	private boolean initArray(){
		for (int i = 0; i < numbersSaved; i++){
			lastTenNumbers[i] = 0;
		}
		return true;
	}
}