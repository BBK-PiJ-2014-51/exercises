package exercise2;
public class OldPhone implements Phone{

	@Override
	public void call(String number) {
		System.out.println("Calling " + number);
	}
	
}