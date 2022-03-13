package arrayPro;

import java.util.Arrays;
import java.util.List;

public class findTheMaxElementInList {
public static void main(String[] args) {
	int arr [] = {3,24,2,52,5,24,34,6};
	List<Integer> asList = Arrays.asList(3,24,2,52,5,24,34,6);
	Integer integer = asList.stream().max(Integer::compareTo).get();
	System.out.println(integer);
}
}
