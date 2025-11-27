package collection.program;

import java.util.Vector;

public class SampleVector {
		public static void main(String[] args) {
			Vector ar1 = new Vector();
			ar1.add(10);
			ar1.add("Hello");
			ar1.add(1,38);
			Vector ar2 = new Vector();
			ar2.add(17);
			ar2.addAll(ar1);
			System.out.println(ar2);
			ar1.remove(1);
			ar1.removeAll(ar2);
			System.out.println(ar1);
			System.out.println(ar2.get(0));
		}
}
