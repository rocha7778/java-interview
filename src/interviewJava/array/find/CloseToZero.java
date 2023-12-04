package interviewJava.array.find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {-5,-4,-3,-2,3,4,5};
		
		System.out.println(closeToZero(arr));

	}

	public static List<Integer> closeToZero(int[] arr) {

		 List<Integer> list = Arrays.stream(arr)
                 .boxed() // Convert int to Integer
                 .sorted(Integer::compareTo)
                 .collect(Collectors.toList());
		 
		 
		if(addZeroValueIfItNoPresent(list)) {
			list.add(0);
		}
	 
		list.sort( Integer::compareTo);
		
		int indexZero = list.indexOf(0);
		
		System.out.println("indexZero:-->" + indexZero);
		System.out.println("value next right to indexZero:-->" + list.get(indexZero+1));
		System.out.println("value next left indexZero:-->" + list.get(indexZero-1));
		
		int temp1 = getAbsValue(list.get(indexZero+1));
		int temp2 = getAbsValue(list.get(indexZero-1));
		
		List<Integer> resultList = new ArrayList<>();
		
		if(temp1==temp2) {
			resultList.add(temp1);
			resultList.add(temp2);
		}
		
		if(temp1>temp2) {
			resultList.add(temp2);
		}else {
			resultList.add(temp1);
		}
		
		
		return resultList;
	}
	
	public static boolean addZeroValueIfItNoPresent(
			 List<Integer> list) {
		return list.indexOf(0) == -1;
		
	}
	
	public static int getAbsValue(int value) {
		return Math.abs(value);
	}

	
}
