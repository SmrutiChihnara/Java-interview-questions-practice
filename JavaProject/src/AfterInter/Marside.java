package AfterInter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Marside {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\JMS2KOR\\Desktop\\VCU FOLDER\\new Text Document.txt");
		FileReader fr = new FileReader(file); // reads the file
		BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
		StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
		String line;
		Set<String> set = new HashSet<String>();
		while ((line = br.readLine()) != null) {
			String split[] = line.split(" ");
			for(String s :split)
			{
				if(set.contains(s))
				{
					
					
				}
			}
			
		}
	}
}
