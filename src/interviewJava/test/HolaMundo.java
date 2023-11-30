package interviewJava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input: s = "cbaebabacd", p = "abc"
		// Output: [0,6]

		// Input: s = "abab", p = "ab"

		String s = "cbaebabacd";
		String p = "abc";
		int sLength = s.length();
		int pLength = p.length();
		int counter = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		char[] targetAnagram = p.toCharArray();

		while ((pLength) + counter <= sLength) {
			String subString = s.substring(counter, (pLength) + counter);
			if (isAnagram(subString.toCharArray(), targetAnagram)) {
				int index = s.indexOf(subString);
				list.add(index);
			}
			counter++;
		}

		System.out.println(list);

	}

	public static boolean isAnagram(char[] word1, char[] word2) {

		Arrays.sort(word1);
		Arrays.sort(word2);

		if (Arrays.equals(word1, word2)) {
			System.out.println("is Anagram");
			return true;
		}

		return false;

	}

}
