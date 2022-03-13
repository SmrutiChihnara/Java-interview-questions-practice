package com.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CheckSing {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
		Single newObj = Single.getInstance();

		Class<?> forName = Class.forName("com.in.Single");
		Constructor<Single> declaredConstructor = (Constructor<Single>) forName.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		System.out.println(newObj.hashCode() + "  newObj ");
		System.out.println(declaredConstructor.hashCode() + "  declaredConstructor ");

		// Single newInstance = Single.class.newInstance();
		/*
		 * System.out.println(newObj.hashCode()); ObjectOutputStream fileOutputStream =
		 * new ObjectOutputStream( new
		 * FileOutputStream("C:\\Users\\JMS2KOR\\Desktop\\VCU FOLDER\\new Text Document.txt"
		 * )); fileOutputStream.writeObject(newObj); ObjectInputStream inputStream = new
		 * ObjectInputStream( new
		 * FileInputStream("C:\\Users\\JMS2KOR\\Desktop\\VCU FOLDER\\new Text Document.txt"
		 * )); Single seriObject = (Single) inputStream.readObject();
		 * System.out.println("seriObject  " + seriObject.hashCode()); Single single =
		 * (Single) newObj.clone();
		 */

 	}
}
