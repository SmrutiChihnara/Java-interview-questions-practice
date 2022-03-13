package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("");
		list.forEach(System.out::print);		

	}
}
