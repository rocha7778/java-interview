package interviewJava.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OtroMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcabc";

        // Convert the string to a stream of characters
        Map<Character, Long> frequencyMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the letter frequencies
        frequencyMap.forEach((letter, count) ->
                System.out.println("Letter: " + letter + ", Count: " + count));

	}

}
