package collection.program;

import java.util.TreeSet;

public class SampleTreeSet {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(12);
		t.add(90);
		t.add(79);
		t.add(34);
		t.add(34);	//it's not allowed order of insertion & it is auto shorted & store only homogeneous type of data.
		t.add(0);
		t.add(89);
		System.out.println(t);
	}
}
