package interviewJava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	// Input: s = "cbaebabacd", p = "abc"
		// Output: [0,6]

		// Input: s = "abab", p = "ab"

		String s = "cbaebabacd";
		String p = "abc";
	
		findIndexesAangram(s, p);
		System.out.println(findIndexesAnagram(s, p));

	}
	
	private static List<Integer> findIndexesAnagram(String s, String p){
		
		return IntStream.range(0, s.length()- p.length()+ 1)
		          .mapToObj(i ->  s.substring(i, p.length()+i))
		          .filter(sub -> isAnagram(sub, p))
		          .map(sub -> s.indexOf(sub))
		          .collect(Collectors.toList());
	}
	
	private static void findIndexesAangram(String s, String p) {
		
		int targetLenght =  p.length();
		int processingLimit = s.length() -p.length() +1;
		List<Integer> listIndex = new ArrayList<>();
		
		
		for( int i=0; i<processingLimit;i++) {
			String subString = s.substring(i,targetLenght+i);
			if(isAnagram(subString,p)) {
				listIndex.add(s.indexOf(subString));
			}
		}
		
		System.out.println(listIndex);
	}

	private static boolean isAnagram(String subString, String p) {
		
		char[] subChars = subString.toCharArray();
		char[] pChars = p.toCharArray();
		Arrays.sort(subChars);
		Arrays.sort(pChars);
		
		return Arrays.equals(subChars, pChars);
	}

}
