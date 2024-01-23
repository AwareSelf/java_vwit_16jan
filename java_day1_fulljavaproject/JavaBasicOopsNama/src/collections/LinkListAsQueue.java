package collections;
import java.util.*;
public class LinkListAsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(50);
		q.offer(10);
		q.offer(5);
		q.offer(60);
		
		System.out.println(q.size());
	  int no = q.peek();
	  System.out.println("peeked value present at front of queue:"+no);
	  System.out.println(q.size());
	  
	  no = q.poll();
	  System.out.println("polled value present at front of queue:"+no);
	  System.out.println(q.size());
	  
	  q.forEach((Integer i)->System.out.println(i));
	  
	  //diff between linklist  as queue and priority queue as queue
	  
	  

	}

}
