package collection.program;

import java.util.HashSet;

public class SampleHashset {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add("Hello");
		h.add("Hello");  	//Not allow duplicate values & order of insertion.
		h.add(743);
		h.add("Byee");
		System.out.println(h);
	}
}
