package hashCode;

import java.util.HashMap;
import java.util.LinkedHashMap;

class Foo {
	int id;
	String whatevs;

	Foo(int id, String whatevs) {
		this.id = id;
		this.whatevs = whatevs;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Foo) {
			System.out.println();
			return ((Foo) other).whatevs.equals(this.whatevs);
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println();
		return this.id;
	}
}

public class Test {
	public static void main(String[] args) {
		Foo foo = new Foo(100, "1");
		Foo foo1 = new Foo(101, "2");
		Foo foo2 = new Foo(102, "3");

		HashMap<Foo, String> map = new LinkedHashMap<Foo, String>();
		/*
		 * map.put(foo, "First"); map.put(foo1, "second"); map.put(foo, "second");
		 * System.out.println(map); map.get(foo2);
		 */
		
		HashMap<String, String> maps = new LinkedHashMap<String, String>();
		maps.put("One", "1");
		maps.put("two", "2");
		maps.put("One", "1");
		

	}
}
