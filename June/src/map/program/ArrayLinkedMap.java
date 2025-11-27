package map.program;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ArrayLinkedMap {
	public static void main(String[] args) {
		int[] ar= {20,80,10,70,20,10};
		LinkedHashMap<Integer, Integer> l = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (!l.containsKey(ar[i])) {
				l.put(ar[i], 1);
			}
			else {
				Integer n = l.get(ar[i]);
				n++;
				l.put(ar[i], n);
			}
		}
		
		for (Entry<Integer,Integer> o : l.entrySet()) {
			System.out.println(o.getKey()+"-"+o.getValue());
		}
	}
}
