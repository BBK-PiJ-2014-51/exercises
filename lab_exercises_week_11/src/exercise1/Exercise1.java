package exercise1;
public class Exercise1{
	public static void main(String[] args) {
		Comparator comp = new Comparator();
		System.out.println(comp.getMax(1.2, 1.8));
		System.out.println(comp.getMax(2, 8));
		System.out.println(comp.getMax("6", "4"));
		System.out.println(String.valueOf(comp.getMax(new Integer(5), new Integer(2))));
	}
}