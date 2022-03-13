package arrayPro;

public class SecondLargestNumberInAnArray {
	public static void main(String[] args) {
		int arr[] = { 2, 52, 12, 4,80,60 };
		int lagestNumber = Integer.MIN_VALUE;
		int secondLagest = Integer.MIN_VALUE;
		for (int data : arr) {
			if (data > lagestNumber) {
				secondLagest = lagestNumber;
				lagestNumber = data;
			} else if (data > secondLagest) {
				secondLagest = data;

			}
		}
		System.out.println(secondLagest);
		//System.out.println(lagestNumber);
	}
}
