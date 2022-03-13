import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	public  static void revreseNumber() {
		int arr[] = { 1, 2, 3, 4,5,6 };
		int revsedeIndex = 4;
		int midPoint = revsedeIndex / 2;
		int i = 0;
		while (i < midPoint) {
			int temp = arr[i];
			arr[i] = arr[revsedeIndex];
			arr[revsedeIndex] = temp;
			i++;
			revsedeIndex--;

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void removeArray() {
		int arr[] = { 2, 2, 3, 4, 4, 5, 6, 6, 6 };
		int length = arr.length - 1;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < length; k++) {
						arr[k] = arr[k + 1];
					}
					length--;
				}
			}
		}
		for (int i = 0; i <= length; i++) {
			System.out.println(arr[i]);
		}
		{
			// System.out.println(arrData);
		}

		// System.out.println(Arrays.toString(arr));

	}

	public static void countNumber() {
		int arr[] = { 2, 3, 4, 4, 4, 5, 6, 6 };
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != -1) {
					count++;
					arr[j] = -1;
				}

			}
			if (arr[i] != -1)
				System.out.println(arr[i] + "number " + count);
		}
	}

	public static void countNuber() {
		int arr[] = { 2, 3, 4, 5, 6, 6 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : arr) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}
		System.out.println(map);
	}

	public static void numberFind() {
		int lagest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int arr[] = { 3, 4, 9, -1, 100, 0 };
		for (int number : arr) {
			if (number > lagest) {
				lagest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println(lagest);
		System.out.println(smallest);
	}

	public static void count(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != -1) {
					// System.out.println(arr[i]);
					arr[j] = -1;
				}
			}

		}
	}

	public static void main(String[] args) {
		// countNumber();
		// countNuber();
		// numberFind();
		// count(new int[] { 1, 3, 3, 4, 1 });
		revreseNumber();
		
		//removeArray();

		int arr[] = { 2, 3, 4, 6, 7, 9 };
		int j = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (j != arr[i]) {
				// System.out.println(j);
			}
			j++;
		}
	}
}