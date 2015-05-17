package exercise3;
public class OldPhone implements Phone{
	private String brand = null;
	
	public OldPhone(String brand){
		this.brand = brand;
	}
	@Override
	public void call(String number) {
		System.out.println("Calling " + number);
	}
	
	public String getBrand(){
		return brand;
	}
	
}