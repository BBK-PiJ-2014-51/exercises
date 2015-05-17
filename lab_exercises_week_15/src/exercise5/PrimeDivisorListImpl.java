package exercise5;

public class PrimeDivisorListImpl implements PrimeDivisorList {
	int INIT_SIZE = 100;
	IntegerNode[] primes = new IntegerNode[INIT_SIZE];
	int currentIndex = 0;
	
	@Override
	public void add(Integer nextInt) throws IllegalArgumentException{
		if (nextInt == null) throw new NullPointerException();
		if (!isPrime(nextInt)) throw new IllegalArgumentException();
		for (int i = 0; i < currentIndex; i++){
			if (primes[i].getValue().equals(nextInt)){
				primes[i].incrementCount();
				return;
			}
		}
		System.out.println("Incrementing index");
		primes[currentIndex++] = new IntegerNode(nextInt); 
	}
	
	@Override
	public String toString() {
		System.out.println("Count = " + this.currentIndex);
		String output = "[ ";
		int total = 1;
		for (int i = 0; i < currentIndex; i++){
			output += primes[i].getValue();
			if (primes[i].getCount() > 1)
				output = output + "^" + primes[i].getCount();	
			 output += " * ";
			for (int j = 0; j < primes[i].getCount(); j++){
				total *= primes[i].getValue();
			}
		}
		return output.substring(0, output.length() - 2) + "= " + total + " ]";
	}
	
	private boolean isPrime(int num){
		boolean isPrime = true;
		for (int i = num -1; i > 1; i--){
			if (num % i == 0){
				isPrime = false;
			}
		}
		return isPrime;
	}
}
