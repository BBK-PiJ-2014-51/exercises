package exercise2;
public class SmartPhone extends OldPhone{
	private int xCoordinate = 35;
	private int yCoordinate = 105;
	
	
	@Override
	public void call(String number){
		if (Integer.parseInt(number.substring(0, 1)) == 0 && Integer.parseInt(number.substring(1, 2)) == 0){
			System.out.println("Calling " + number + " through the internet to save money!");
		} else {
			super.call(number);
		}
	}
	public void browseWeb(String url){
		System.out.println("Opening " + url);
	}
	
	public String findLocation(){
		String location = "(" + String.valueOf(xCoordinate) + " , " + String.valueOf(yCoordinate) + ")";
		System.out.println(location);
		return location;
	}
}