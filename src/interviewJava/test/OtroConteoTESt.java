package interviewJava.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OtroConteoTESt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abab";
        String p = "ab";

        // Calculate the frequency of the anagram of "abc" substring
        long anagramCount = countAnagramSubstring(s, p);

        // Print the result
        System.out.println("The anagram of 'abc' substring is repeated " + anagramCount + " times.");
		

	}
	
	private static long countAnagramSubstring(String str, String substring) {
        int substringLength = substring.length();

        // Convert substring to char array for sorting
        char[] substringChars = substring.toCharArray();
        Arrays.sort(substringChars);

        return IntStream.range(0, str.length() - substringLength + 1)
                .mapToObj(i -> str.substring(i, i + substringLength))
                .peek(e ->System.out.println("Valor de subcadena: " + e))
                .filter(sub -> isAnagram(sub, substringChars))
                .count();
    }

    private static boolean isAnagram(String s, char[] targetChars) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        return Arrays.equals(sChars, targetChars);
    }


}
