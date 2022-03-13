package hashCode;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

public class StringStream {
	public static void main(String[] args) {

		String string = "Helllo";
            		
               String replaceFirst = string.replaceFirst(" ", "");
              // System.out.println(replaceFirst);
               String first="";
              if(string.charAt(3)==' ')
              {
            	   first = string.substring(0,3);
            	  String secondPart = string.substring(4,string.length()-1);
            	  first=first.concat(secondPart);
              }
             // System.out.println(first);
              Optional.ofNullable(null);
              boolean contains = string.contains("W o");
              boolean contentEquals = string.contentEquals("Hel lo Worl d");
             // string.lines().sorted().forEach(System.out::printf);
             // System.out.println(upperCase);
              string.
              
				/*
				 * System.out.println(contains); System.out.println(contentEquals);
				 */
	}

}