package degineParten;

final public class Student {
	final private String name;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", adress=" + adress + "]";
	}

	final private int id;
	final Adress adress;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Adress getAdress() {
		return new Adress(adress);
	}

	public Student(String name, int id, Adress adress) {
		this.id = id;
		this.name = name;
		this.adress = adress;
		
	}

	public static void main(String[] args) {
		Adress adress = new Adress("Odisha", 12345);
		
		Student student = new Student("Smruti", 100, adress);
		System.out.println(student);
		Adress adress2 = student.getAdress();
		adress2.setNo(123);
		adress2.setState("kanatak");
		System.out.println(student);
		

	}
}
