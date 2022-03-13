package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxValueInOneArray {
public static void main(String[] args) {
	//int arr [] = {3,6,2,9,10};
	List<Integer> asList = Arrays.asList(3,4,5612,4);
	Integer max = Collections.max(asList);
	System.out.println(max);
}
}
