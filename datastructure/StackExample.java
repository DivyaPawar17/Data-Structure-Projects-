package datastructure;

import java.util.Scanner;

public class StackExample {

	int stack[], MaxSize, tos;

	void CreateStack(int size) {
		tos = -1;
		MaxSize = size;
		stack = new int[MaxSize];
	}

	void push(int element) {
		tos++;
		stack[tos] = element;
	}

	boolean is_Full() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);
	}

	boolean is_Empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		return(stack[tos]);
	}
	void print_stack() {
		
	for(int i = tos;i>=-1;i--)
	{
		System.out.println(stack[i]);
	}
	}

public static void main(String args[])   {
	int ch;
	
	Scanner sc=new Scanner(System.in);
	StackExample obj=new StackExample();
	System.out.println("Enter size of stack");
	int size = sc.nextInt();
	obj.CreateStack(size);  // user given size stack
	
	do {
		
	System.out.println("1 push\n2.pop\n3.peek\n4.print\n0.Exit\n");
      ch = sc.nextInt();
      switch(ch)
      {
    	  case 1:
    		  if(!obj.is_Full())  // if not full then take data
    		  {
    			  System.out.println("Enter data is full");
    			  int e=sc.nextInt();
    			  obj.push(e);
    			  System.out.println("Data is pusher");
    		  }
    		  else
    		  {
    			  System.out.println("Stack full");
    		  }
    		  break;
    		  
    	  case 2:
    		  if(!obj.is_Empty())
    		  {
    			  System.out.println("Enter data is pop");
    			  int e=obj.pop();
    			 
    			  System.out.println("Data is poped:"+e);
    		  }
    		  else 
    		  {
    			  System.out.println("Stsck is Empty");
    			  
    		  }
    		  break;
    		  
    	  case 3:
    		  if(!obj.is_Empty())
    		  {
    			  System.out.println("Enter data is peek");
    			  obj.print_stack();
    		  }
    		  else {
    			  
    			  System.out.println("stack is Empty");
    		  }
    		  
    		  break;
    		  
    	  case 0:
    		  System.out.println("Existing....");
    		  break;
    		  default:
    			  System.out.println("Wrong option selected");
    			  break;
    		  
      }
	} while(ch!=0);

}
}



