package AfterInter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

class Animal

{
	public void get(Animal a) {
		System.out.println("Abimal");
	}
}

class Horse extends Animal {
	public void get(Horse a) {
		System.out.println("Hoyrsr");
	}

}

public class ThomsonReturn {

	public static void readFile() throws IOException {
		File file = new File("C:\\Users\\JMS2KOR\\Desktop\\ACQ\\file.txt");
		Scanner scanner = new Scanner(file);
		List<String> list = new ArrayList<String>();
		String sts = "";
		while (scanner.hasNext()) {
			sts = scanner.next().concat(" ").concat(sts);
		}
		System.out.println(sts);
		String split[] = sts.split(" ");
		for (String eachSplit : split) {
			list.add(eachSplit);
		}
		long count = list.stream().filter(data -> data.equals("Hello")).count();
		System.out.println(count);
	}

	public static void main(String[] args) throws IOException {
		readFile();
		Animal animal = new Animal();
		Horse horse = new Horse();
		animal.print(animal);
		horse.print(animal);
		Animal animal2 = new Horse();
		animal2.print(horse);

	}
}
