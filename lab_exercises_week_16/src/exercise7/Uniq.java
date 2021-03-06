package exercise7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Uniq {
	public static void main(String[] args) {
		File file = new File(args[0]);
		ArrayList<String> contents = new ArrayList<String>();
		if (file.exists()){
			BufferedReader in;
			try {
				in = new BufferedReader(new FileReader(file));
				String nextLine = in.readLine();
				while (nextLine != null){
					boolean present = false;
					for (int i = 0; i < contents.size(); i++){
						if (contents.get(i).equals(nextLine)){
							present = true;
							break;
						}
					}
					if (!present) contents.add(nextLine); 
					nextLine = in.readLine();
				}
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.toPath() + " does not exist.");
		}
		
		for (String line : contents){
			System.out.println(line);
		}

	}
}