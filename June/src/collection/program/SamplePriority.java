package collection.program;

import java.util.PriorityQueue;

public class SamplePriority {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(20);
		p.add(83);
		p.add(25);
		p.add(01);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}
	
}
