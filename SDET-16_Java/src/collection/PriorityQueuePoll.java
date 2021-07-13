package collection;

public class PriorityQueuePoll {
	
	public static void main(String[] args) {
		
		java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<Integer>();
		
		queue.add(53);
		queue.add(10);
		queue.add(74);
		queue.add(201);
		
		System.out.println(queue);  //auto sorted //sometime sorting slow in the backend so not give sorted
		System.out.println(queue.poll());//fetch and remove 
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}

}
