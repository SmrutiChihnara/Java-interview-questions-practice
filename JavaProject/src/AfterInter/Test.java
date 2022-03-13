package AfterInter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.RandomAccess;

public class Test implements Cloneable {
	public static void main(String[] args) {
		HashMap<String, String> map = new LinkedHashMap<String, String>();
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

	}
}
