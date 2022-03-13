import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Angram {
	public static void main(String[] args) {
		String sts = "Banana";
		Set<char[]> collect = Arrays.asList(sts.toCharArray()).stream().collect(Collectors.toSet());
		System.out.println(Arrays.toString(collect.toArray()));
		Map<String, String> ap = new HashMap<String, String>();
		for (Entry<String, String> maps : ap.entrySet()) {
              
			
		}

	}
}
