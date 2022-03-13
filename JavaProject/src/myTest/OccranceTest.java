package myTest;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
 
public class OccranceTest {
	
	
	public  static void removeDuplicate()
	{
		String sts = "Hello World Hello";
		//sts.contains("");
		//sts.replace(0, 0)
		Arrays.stream(sts.split(" ")).distinct().forEach(System.out::print);
		
	}
	public static void main(String[] args) {
		removeDuplicate();
		String sts = "AAAnAAABBaBBBBBBBBB";
		char[] charArray = sts.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		int max = Integer.MIN_VALUE;
		char charData = 0 ;
		for (char arr : charArray) {
			if (map.containsKey(arr)) {
				map.put(arr, map.get(arr) + 1);
				if (map.get(arr) > max) {
					max = map.get(arr);
					charData=arr;
				}
			}
			else
			{
				map.put(arr, 1);
			}
		}
		System.out.println(max);
		System.out.println(charData);
	}
}
