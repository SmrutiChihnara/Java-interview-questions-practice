import java.util.Random;

public class Find_RandomNumber {
public static void main(String[] args) {
	int[] array = { 1, 2, 3, 4, 5, 6, 7 };
	Random random = new Random();
	for(int  i =0;i<array.length;i++)
	{
		int nextInt = random.nextInt(array.length);
		array[nextInt]= array[i];
		
	}
}
}
