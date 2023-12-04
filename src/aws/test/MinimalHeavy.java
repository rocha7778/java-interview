package aws.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimalHeavy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		
		

		// List<Integer> result = minimalHeaviestSetA(arr);

		// System.out.println(result);
		Collections.sort(arr, Collections.reverseOrder());
		
		
		System.out.println(arr);
		

		var result = minimalHeaviestSetA(arr);
		
		System.out.println(result);

	}

	public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
		// Write your code here

		int sumTemp = 0;
		int sumRemain = 0;
		int length = arr.size() - 1;
		List<Integer> arrayResult = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {

		
			if (i < length) {
				sumTemp = arr.get(i) + arr.get(i + 1);
			} else {
				if (i == length) {
					sumTemp = arr.get(i) + arr.get(i - 1);
				}
			}

			for (int j = 2; j <= length ; j++) {
				sumRemain = sumRemain + arr.get(j);
			}

			if (sumTemp > sumRemain) {

				arrayResult.add(arr.get(i));
				arrayResult.add(arr.get(i + 1));
			}
		}
		return arrayResult;

	}

}
