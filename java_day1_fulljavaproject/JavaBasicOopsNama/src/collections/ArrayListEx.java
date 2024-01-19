package collections;

import java.util.*;
import java.util.function.Consumer;

//collections can store only object types
public class ArrayListEx {

	public static void main(String[] args) {
		
		//add,remove,set(index,val),get(index),clear,contains,isEmpty,addAll,remove(index),remove(ele),iterator,foreach
		
		List<Integer> lst = new ArrayList<Integer>();
	 	System.out.println(lst.isEmpty());
		lst.add(20); //java 1.5 compiler --> primitive 20 -> Integer object 20 --> wrap/autoboxing --> added to collection
		lst.add(20);
		lst.add(10);
		lst.add(60);
		lst.add(80);
		lst.add(4);
		
		System.out.println(lst); //lst.toString()
		
		
		int no = lst.get(0); //java 1.5 compiler-->Integer object 20 --> primitive 20 --> compiler -> unwrapping/auto unboxing
		System.out.println(no);
		
		
		lst.set(0,22);
		System.out.println(lst);
		
		System.out.println(lst.size());
		
		if(lst.size()>=9)
		{
	     lst.set(8,100);  //this will give u arrayindexoutofbounds exception as index position 8 is not there
	  	System.out.println(lst);
		}
		else
		{
			System.out.println("cant set val at index pos 8 as arraylist size is small and has not reached till have index 8");
		}
		
		lst.remove(4);  //object is also int/Integer and index is int - remove(index) //will remove element at index position 4
	 	System.out.println(lst);
	 	
	 	System.out.println(lst.isEmpty());
	 	lst.clear();
		System.out.println(lst.isEmpty());
		
		List<Integer> lst1 = new ArrayList<Integer>(6);
		lst1.add(100);
		lst1.add(200);
		lst1.add(5);
		lst1.add(67);
		lst1.add(34);
		
		
		lst.addAll(lst1);
		System.out.println(lst);
		 
		lst1 = new ArrayList<Integer>(3);
		 lst1.add(11);
		 lst1.add(12);
		 lst1.add(13);
		
		lst.addAll(2, lst1); //overloaded addAll to add collection at particular index pos
		System.out.println(lst);
		
		System.out.println(lst.contains(200));
		System.out.println(lst.contains(111));
		
		
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext())
		{				
			int val = it.next();  // Integer --> int -compiler auto unboxing
			System.out.println(val);
		}
		 
		
	 	
		System.out.println("printitng list using foreach----1");
		Consumer<Integer> c = (Integer e)->{  System.out.println(e); };
		lst.forEach(c);
		
		//above 2 lines code is same as below
		System.out.println("printitng list using foreach----2");
		lst.forEach((Integer e)->{  
			                       System.out.println(e); 
			                       int no1 = e;
			                       no1++;
			                       System.out.println(no1);
			                       
			                      }
			       );
		
	}

}
