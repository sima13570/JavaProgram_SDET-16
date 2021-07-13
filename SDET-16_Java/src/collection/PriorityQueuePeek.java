package collection;

import java.util.PriorityQueue;

public class PriorityQueuePeek {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		que.add(52);
		que.add(41);
		que.add(10);
		que.add(741);
		
		System.out.println(que);
		System.err.println(que.peek());//fetched but not remove
		
		System.out.println(que);
		System.err.println(que.peek());
		System.out.println(que);
	}

}
