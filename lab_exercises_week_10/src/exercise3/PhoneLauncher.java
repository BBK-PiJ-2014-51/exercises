package exercise3;
public class PhoneLauncher{
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		}
		public void launch() {
			OldPhone phone = new OldPhone("Samsung");
			System.out.println("The brand is: " + phone.getBrand());
			
			phone = new MobilePhone("Nokia");
			System.out.println("The brand is: " + phone.getBrand());
			
			phone = new SmartPhone("Apple");
			System.out.println("The brand is: " + phone.getBrand());
		}
}