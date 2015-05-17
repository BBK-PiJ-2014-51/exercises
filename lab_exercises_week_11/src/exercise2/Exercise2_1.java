package exercise2;

public class Exercise2_1{
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		//smartphone methods
		myPhone.findLocation();
		myPhone.browseWeb("www.google.com");
		
		//mobile phone methods
		myPhone.ringAlarm("ring ring");
		
		//old phone methods
		myPhone.call("555 5555");
		
	}
}