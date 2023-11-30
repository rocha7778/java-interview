package interviewJava.test;

import java.util.stream.IntStream;

public class OtroConteoTESt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "cbaebabacd";
		String p = "abc";

        // Calculate the frequency of the "abc" substring
        long abcCount = countSubstring(s, "abc");

        // Print the result
        System.out.println("The 'abc' substring is repeated " + abcCount + " times.");
		

	}
	
	private static long countSubstring(String str, String substring) {
        int substringLength = substring.length();

        return IntStream.range(0, str.length() - substringLength + 1)
                .mapToObj(i -> str.substring(i, i + substringLength))
                .filter(sub -> sub.equals(substring))
                .count();
    }

}
