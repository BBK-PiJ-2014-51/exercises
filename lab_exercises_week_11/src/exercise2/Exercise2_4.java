package exercise2;

public class Exercise2_4{
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
		SmartPhone nextPhone = (SmartPhone) aPhone; //nextPhone can compile all methods again
		nextPhone.findLocation();
		nextPhone.ringAlarm("beep beep"); 
		nextPhone.call("555 4444");
	}
}