package interviewJava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input: s = "cbaebabacd", p = "abc"
		// Output: [0,6]

		// Input: s = "abab", p = "ab"

		String s = "cbaebabacd";
		String p = "abc";

		List<Integer> listOfIndexes = new ArrayList<>();
		for (int j = 0; j < s.length() - 2; j++) {
			String result = s.substring(j, p.length() + j);
			if (isAnagram(result, p)) {
				listOfIndexes.add(s.indexOf(result));
			}
		}

		System.out.println(listOfIndexes);
		System.out.println(findAnagramIndexes(s, p));

	}

	
	private static List<Integer> findAnagramIndexes(String source, String comparisonTarget){
		
		int comparisonTargetLengh = comparisonTarget.length();
		int maximunIteration =  source.length() - comparisonTargetLengh + 1;
		
		return IntStream.range(0, maximunIteration)
		.mapToObj(i -> source.substring(i, i+comparisonTargetLengh))
		.filter(sub -> isAnagram(sub, comparisonTarget))
		.map(sub -> source.indexOf(sub))
		.collect(Collectors.toList());
	}

	public static boolean isAnagram(String word, String targetComparison) {
		char[] wordChar = word.toCharArray();
		char[] targetComparisonChar = targetComparison.toCharArray();
		Arrays.sort(wordChar);
		Arrays.sort(targetComparisonChar);
		return Arrays.equals(wordChar, targetComparisonChar);
	}
}
