import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Collage {
	int id;

	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + "]";
	}

	String name;

	public Collage(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Student implements Comparable<Student> {
	int age;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;

	}

	@Override
	public int compareTo(Student o) {
		if (o.age > age) {
			return -1;
		} else if (o.age < age) {
			return 1;
		} else
			return 0;
	}
}

public class CompatorTest {

	public static void main(String[] args) {
		List<Collage> list = new ArrayList<Collage>();
		list.add(new Collage(100, "Smrut"));
		list.add(new Collage(10, "Smrut"));
		list.add(new Collage(101, "Smrut"));
		// Collections.sort(list);
		/*
		 * for (Collage student : list) { System.out.println(student); }
		 */
		Runnable run = () -> {

		};
		list.stream().sorted(Comparator.comparingInt(Collage::getId).reversed()).collect(Collectors.toList())
				.forEach(System.out::print);
		

	}

}
