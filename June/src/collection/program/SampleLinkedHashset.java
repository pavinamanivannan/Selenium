package collection.program;

import java.util.LinkedHashSet;

public class SampleLinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add(56);
		l.add("Hello");
		l.add("Hello");	//It's not allowed duplicate values & It's follow Order of insertion.
		l.add(743);
		l.add(10.8);
		l.add("Bye");
		System.out.println(l);
	}
}
