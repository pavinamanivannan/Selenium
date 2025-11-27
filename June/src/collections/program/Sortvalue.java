package collections.program;

import java.util.ArrayList;
import java.util.Collections;

public class Sortvalue {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(13);
		a.add(90);
		a.add(55);
		Collections.sort(a);
		System.out.println(a);
	}
}
