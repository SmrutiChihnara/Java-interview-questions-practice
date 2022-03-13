package com.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class test {
	public void run()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.stream().map(String::toUpperCase);
		String sts = "Hello";
		Character orElse = Optional.ofNullable(sts.charAt(4)).orElse('c');
		char ch =orElse;
		Runnable runnable = ()->
		{
			System.out.println("Hello");
			
		};
		Thread thread = new  
				Thread(runnable);
		thread.start();
		
		
		
	}
}
