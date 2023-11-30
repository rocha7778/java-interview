package interviewJava.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnagramJava8 {
	
	
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";

        // Calculate the indices of the anagram of "ab" substring
        List<Integer> anagramIndices = findAnagramIndices(s, p);

        // Print the result
        System.out.println("The anagram of 'ab' substring is repeated at indices: " + anagramIndices);
    }
	
	
	
	private static List<Integer> findAnagramIndices(String str, String substring) {
        int substringLength = substring.length();
        char[] substringChars = substring.toCharArray();
        Arrays.sort(substringChars);

        return IntStream.range(0, str.length() - substringLength + 1)
                .mapToObj(i -> str.substring(i, i + substringLength))
                .filter(sub -> isAnagram(sub, substringChars))
                .map(sub -> str.indexOf(sub))
                .collect(Collectors.toList());

    }

    private static boolean isAnagram(String s, char[] targetChars) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        return Arrays.equals(sChars, targetChars);
    }

}
