package collections.program;

import java.util.ArrayList;
import java.util.TreeSet;

public class ListToTreeSet {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(25);
		a.add(01);
		TreeSet<Integer> t = new TreeSet<Integer>(a);
		System.out.println(t);
	}
}
