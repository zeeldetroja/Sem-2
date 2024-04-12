import java.util.*;
import java.io.*;

public class QueueDemo{
	public static void main(String[] args) {
		Queue<String> q = new  LinkedList<String>();
		q.add("Tom");
		q.add("Jerry");
		q.add("Bheem");
		q.add("Raju");
		q.add("Harry");
		System.out.println("Elemnets in Queue:"+q);
		System.out.println("Removed elemnets"+q.remove());

		System.out.println("Head: "+q.element());
		System.out.println("poll: "+q.poll());
		System.out.println("peek: "+q.peek());
		System.out.println("Elemnets in Queue: "+q);
	}
}