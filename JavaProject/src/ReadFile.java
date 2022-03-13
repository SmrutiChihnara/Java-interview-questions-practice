import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\JMS2KOR\\Desktop\\MY FOLDER\\DataMaticsTimeSheet\\quection\\time.txt");
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	String line = "";
	while((line =bufferedReader.readLine())!=null)
	{
		System.out.println(line);
	}
}
}
