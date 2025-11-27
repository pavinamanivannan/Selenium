package map.program;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapPrgm {
	public static void main(String[] args) {
		String s = "Pavina";
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!l.containsKey(ch)) {
				l.put(ch, 1);
			}
			else {
				Integer n = l.get(ch);
				n++;
				l.put(ch, n);
			}
		}
		
		for (Entry<Character,Integer> o : l.entrySet()) {
			System.out.println(o.getKey()+"-"+o.getValue());
		}
	}
}
