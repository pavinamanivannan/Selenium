package collections.program;

import java.util.ArrayList;
import java.util.Collections;

public class Reveresvalue {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(90);
		a.add(9);
		a.add(19);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
	}
}
