package Java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fristNonRepartedCharInStringUsingJava8 {
	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";

		Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		input.chars().mapToObj(e -> (char) e).collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(data -> data.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();

	}
}
