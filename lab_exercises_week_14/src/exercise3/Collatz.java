package exercise3;

import java.util.ArrayList;

public class Collatz {
	
	public static ArrayList<Integer>getCollatzSequence(int currentNum, ArrayList<Integer> sequence){
		sequence.add(currentNum);
		if (currentNum == 1){
			return sequence;
		} else if (currentNum % 2 == 0){
			return getCollatzSequence(currentNum / 2, sequence);
		} else {
			return getCollatzSequence(currentNum * 3 + 1, sequence);
		}
	}
	
}