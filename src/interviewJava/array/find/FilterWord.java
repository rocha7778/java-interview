package interviewJava.array.find;

import java.util.ArrayList;
import java.util.List;

public class FilterWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] words = {"the", "dog", "a", "bone"};
		String word = "ae";
		

	}

	public static String[] filterWords(String[] words, String letters) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		List<String> listWord = new ArrayList<>();
		int tempIndex = -1;
		int tempIndex2 = -1;
		
		for(int i=0; i<words.length; i++) {
			 tempIndex =  words[i].indexOf(letters.toCharArray()[0]);
			 tempIndex2 = words[i].indexOf(letters.toCharArray()[1]);
			 if(tempIndex != -1 ||  tempIndex != -1) {
				 listWord.add(words[i]);
				 
				 
			 }
		}
		
		
		

		return (String[]) listWord.toArray();
	}

}
