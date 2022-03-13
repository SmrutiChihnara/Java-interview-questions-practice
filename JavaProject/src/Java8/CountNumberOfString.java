package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfString {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Smruti", "Ram", "Smruti", "Ram");
		Map<String, Long> counts = asList.stream()
				.collect(Collectors.groupingBy(e -> e, java.util.stream.Collectors.counting()));
		for (Entry<String, Long> entry : counts.entrySet()) {
			// System.out.println(entry.getKey()+" "+entry.getValue());

		}

		Map<String, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(element -> element, Collectors.counting()));

		List<Character> asList2 = Arrays.asList('S', 'm', 'r', 'u', 't', 'i');
		Map<Character, Long> collect2 = asList2.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		for (Entry<Character, Long> entry : collect2.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
