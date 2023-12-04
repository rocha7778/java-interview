package interviewJava.array.find;

public class FindBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);

	}

	static boolean exists(int[] ints, int k) {

		int last = ints.length - 1;
		int key = k;
		int first = 0;

		int mid = (first + last) / 2;
		while (first <= last) {
			if (ints[mid] < key) {
				first = mid + 1;
			} else if (ints[mid] == key) {
				return true;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			return false;
		}

		return false;
	}

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

}
