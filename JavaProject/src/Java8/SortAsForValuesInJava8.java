package Java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortAsForValuesInJava8 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 3);
		map.put(90, 1);
		map.put(5, 10);
		map.put(10, 0);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getKey, (e1, e2) -> e1, LinkedHashMap::new));
		File file = new File("C:\\Users\\JMS2KOR\\Desktop\\response.txt");
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		Scanner scanner = new Scanner(inputStreamReader);
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}

	}
}
