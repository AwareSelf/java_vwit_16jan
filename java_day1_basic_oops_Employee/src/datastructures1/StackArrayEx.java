package datastructures1;
import java.util.*;

public class StackArrayEx {

	public static void main(String[] args) {
	
		StackArrayList ob = new StackArrayList();
		ob.push(10);
		ob.push(20);
		ob.push(50);
		ob.push(15);
		
		System.out.println(ob.pop()); //15
		System.out.println(ob.pop()); //50
		System.out.println(ob.pop()); //20
		System.out.println(ob.pop()); //10
		System.out.println(ob.pop()); //stack is empty -1
		

	}

}


class StackArrayList
{
	
	int[] stk;
	int top;
	
	StackArrayList()
	{
		stk = new int[20];
		top = -1;
	}
	
	
	void push(int data)
	{
	
		top++;
		this.stk[top] = data;
				
	}
	
	
	int pop()
	{
		if(top!=-1)
		{
		int val = this.stk[top];
		top = top -1;
		return val;
		}
		else
		{
			System.out.println("Stack is empty...");
			return -1;
		}
	}
	
}
