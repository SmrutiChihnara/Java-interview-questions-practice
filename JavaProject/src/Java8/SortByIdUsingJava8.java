package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
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

	private int id;

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	private String name;

}

public class SortByIdUsingJava8 {
	public static void main(String[] args) {
		List<Student1> asList = Arrays.asList(new Student1(100, "Smruti"),new Student1(201, "Ranjan"),new Student1(100, "Chihnara"));
		Collections.sort(asList,Comparator.comparing(Student1::getId));
		for(Student1 student1 :asList)
		{
			System.out.println(student1.toString());
		}
		
		
	}

}
