package Java8;

import java.util.Optional;

class Student {
	int id;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	String name;

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

public class OptClassTest {
public static void main(String[] args) {
	Student1 student = new Student1(100, "Smruti");
	Optional<String> ofNullable = Optional.ofNullable(student.getName());
	System.out.println(ofNullable);
	if(ofNullable.isEmpty())
	{
		System.out.println("Hello");
	}
	ofNullable.ifPresent(data->data.toUpperCase());
	System.out.println(ofNullable);
	ofNullable.orElse("");
	
	
	
}
}
