package arrayPro;

public class SmallestAndLargestElementInAnArray {
	public static void main(String[] args) {
		int arrdata[] = { 2, 82, 1, 8, 3 };
		int maxNumber = Integer.MIN_VALUE;
		int smllestNumber = Integer.MAX_VALUE;
		for (int arr : arrdata) {
			if (maxNumber < arr) {
				maxNumber = arr;
			} else if (smllestNumber > arr) {
				smllestNumber = arr;
			}

		}
		System.out.println(maxNumber);
		System.out.println(smllestNumber);
	}
}
