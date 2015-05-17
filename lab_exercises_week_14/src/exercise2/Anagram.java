package exercise2;
import java.util.ArrayList;

public class Anagram {
	private ArrayList<String> anagramResults;
	private String originalWord;
	
	public Anagram(String originalWord){
		anagramResults = new ArrayList<String>();
		this.originalWord = originalWord;
	}
	
	public ArrayList<String> getAnagramResults(){
		return anagramResults;
	}
	
	public static ArrayList<String> AnagramFinder(String originalWord){
		Anagram anagram = new Anagram(originalWord);
		ArrayList<String> letters = new ArrayList<String>();
		for (int i = 0; i < originalWord.length(); i++){
			letters.add(String.valueOf(originalWord.charAt(i)));
		}
		anagram.getAnagrams(letters, "");
		return anagram.getAnagramResults();
	}
	
	private void getAnagrams(ArrayList<String> letters, String currentWord){
		if (letters.isEmpty()) {
			if (!currentWord.equals(originalWord)) anagramResults.add(currentWord);
			return;
		}
		for (int i = 0; i < letters.size(); i++){
			String newWord = currentWord + letters.get(i); 
			ArrayList<String> nextLetterSet = new ArrayList<String>();
			for (int j = 0; j < letters.size(); j ++){
				nextLetterSet.add(letters.get(j));
			}			
			nextLetterSet.remove(i);
			getAnagrams(nextLetterSet, newWord);
		}
	}
}