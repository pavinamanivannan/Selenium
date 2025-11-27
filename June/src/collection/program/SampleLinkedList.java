package collection.program;

import java.util.LinkedList;

public class SampleLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("hello");
		l.add(65);
		l.add("Byee");
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
	}
}
