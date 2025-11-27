package collections.program;

import java.util.Collections;
import java.util.TreeSet;

public class ReveresListTree {
	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>(Collections.reverseOrder());
		a.add(19);
		a.add(80);
		a.add(45);
		System.out.println(a);
	}
}
