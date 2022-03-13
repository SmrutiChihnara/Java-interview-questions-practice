package com.in;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import org.w3c.dom.ls.LSInput;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>(list);
		Collections.sort(list, Collections.reverseOrder());
		Collections.reverseOrder();
		SortedMap<Integer, Integer> amp = new TreeMap<Integer, Integer>();
		amp.put(2, 3);
		amp.put(9, 1);
		amp.put(10, 1);
		amp.put(0, 1);
		amp.put(3, 1);
		System.out.println(amp);
		Collection<Integer> values = amp.values().stream().collect(C)
		//Collections.sort(values);

	}

}
