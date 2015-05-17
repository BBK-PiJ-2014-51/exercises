package exercise1;
public class SmartPhone extends MobilePhone{
	private int xCoordinate = 35;
	private int yCoordinate = 105;
	
	public void browseWeb(String url){
		System.out.println("Opening " + url);
	}
	
	public String findLocation(){
		String location = "(" + String.valueOf(xCoordinate) + " , " + String.valueOf(yCoordinate) + ")";
		System.out.println(location);
		return location;
	}
}