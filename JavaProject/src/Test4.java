import java.sql.Date;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test4 {
public static void main(String[] args) {
	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	map.put("1/2/3", 200);
	map.put("1/2/4", 200);
	map.put("1/2/5", 200);
	map.put("1/2/6", 200);
	System.out.println(map);
	System.out.println(Arrays.toString( map.entrySet().toArray()));
	String sts = "Hello world";
	System.out.println(sts.indexOf("He"));
}
}
