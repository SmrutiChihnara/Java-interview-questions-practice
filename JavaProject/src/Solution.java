import java.util.Arrays;

public class Solution
{
    public static  int[] solution(int N) 
    {
        int[] array = new int[N];
        Arrays.fill(array, 1);
        return array;
    }
    public static void main(String[] args) {
		int[] solution = solution(4);
		for(int s :solution)
		{
			System.out.println(s);
		}
	}
}