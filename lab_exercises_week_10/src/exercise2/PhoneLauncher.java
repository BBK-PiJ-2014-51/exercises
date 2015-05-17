package exercise2;
public class PhoneLauncher{
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
		}
		public void launch() {
			SmartPhone phone = new SmartPhone();
			phone.call("5555555");
			phone.call("123456");
			phone.call("00207421");
			
		}
}