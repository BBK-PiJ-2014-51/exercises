package exercise2;

public class Exercise2_3{
	public static void main(String[] args) {
		MobilePhone myPhone = new SmartPhone();
		//smartphone methods - won't compile methods defined in supertype
		// myPhone.findLocation();
		// myPhone.browseWeb("www.google.com");
		
		//mobile phone methods
		myPhone.ringAlarm("ring ring");
		
		//old phone methods
		myPhone.call("555 5555");
		
		testPhone(myPhone);
	}
	
	private static void testPhone(Phone aPhone){
		// aPhone.ringAlarm("beep beep"); //won't compile methods defined in super type.
		aPhone.call("555 4444");
	}
}