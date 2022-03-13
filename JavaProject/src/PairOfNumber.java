import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairOfNumber {
public static void main(String[] args) {
	int arr [] = {2,3,10,5,6};
	int sum =8;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int count=0;
	for(int arrData:arr)
	{
		if(map.containsKey(sum-arrData))
		{
			count++;
			map.put(arrData,sum-arrData );
			
		}
		else 
		{
			map.put(arrData, 0);
		}
	}
	for(Entry<Integer, Integer> maps :map.entrySet())
	{
		if(maps.getValue()!=0)
		{
			System.out.println(maps.getKey()+ "  "+maps.getValue());
		}
	}
	//System.out.println(map);
	System.out.println(count);
	
}
}
