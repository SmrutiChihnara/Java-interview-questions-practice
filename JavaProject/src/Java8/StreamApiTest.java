package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student2 {
	int id;
	String data;

	public Student2(int id, String name) {
		this.id = id;
		this.data = data;
		// TODO Auto-generated constructor stub
	}
}

public class StreamApiTest {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 5, 10, 8);
		// allMatch
		boolean allMatch = asList.stream().allMatch(data -> {
			if (data % 2 == 0) {
				return true;
			} else {
				return false;
			}
		});
		System.out.println(allMatch);
		// anyMatch
		boolean anyMatch = asList.stream().anyMatch(data -> {
			if (data % 3 == 0) {
				return true;

			} else {
				return false;
			}

		});
		// Collect
		HashMap<String, String> data = new LinkedHashMap<String, String>();
		List<String> asList2 = Arrays.asList("One", "Two", "Three");
		asList2.stream().collect(Collectors.toMap(Function.identity(), String::length));

		System.out.println(anyMatch);
		asList.stream().collect(Collectors.toList());

		// distinct
		// asList.stream().sorted().distinct().forEach(System.out::print);
		// asList.stream().unordered().forEach(System.out::print);

		asList.stream().sorted().forEach(System.out::print);

		List<Student2> asList3 = Arrays.asList(new Student2(100, "Smruti"), new Student2(102, "Ranjan"),
				new Student2(90, "Sahu"));

	}

}
