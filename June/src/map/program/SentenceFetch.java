package map.program;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SentenceFetch {
	public static void main(String[] args) {
		String s = "Hi I'm Pavina I'm from TamilNadu";
		String[] str = s.split(" ");
		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (! l.containsKey(str[i])) {
				l.put(str[i], 1);
			}
			else {
				int n = l.get(str[i]);
				l.put(str[i], ++n);
			}
		}
		for (Entry<String, Integer> e : l.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
	}
}
