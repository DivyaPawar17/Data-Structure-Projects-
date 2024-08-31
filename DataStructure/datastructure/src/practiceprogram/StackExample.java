package practiceprogram;

import java.util.Scanner;

public class StackExample {
	
	int stack[],maxsize,tos;
	
	void createStack(int size) {
		tos = -1;
		maxsize = size;
		stack = new int [maxsize];
	}
	
	void push(int element) {
		tos++;
		stack[tos]=element;
	}
	boolean is_full() {
		if(tos==maxsize -1)
			return true;
		else
			return false;
	}
	
	int pop() {
		int temp=stack[tos];
		tos--;
		return (temp);
	}
	boolean is_empty() {
		if(tos == -1)
			return true;
		else
			return false;
	}
	int peek() {
		return(stack[tos]);
	}
	
	void print_stack() {
		for(int i=tos;i>=-1;i--)
		{
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner (System.in);
		StackExample obj=new StackExample();
		int size = sc.nextInt();
		obj.createStack(size);
		
		do {
			System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(!obj.is_full()) {
					System.out.println("Enter data is full");
					int e=sc.nextInt();
					obj.push(e);
					System.out.println("data is pusher");
				}
				else
				{
					System.out.println("Stack is full");
				}
				break;
				
			case 2:
				if(!obj.is_empty()) {
					System.out.println("Enter data is pop");
				int e=obj.pop();
				System.out.println("Data is popped"+e);
			}
			else
			{
				System.out.println("stack is empty");
			}
			break;
			case 3:
				if(!obj.is_empty()) {
					System.out.println("Enter data is peek");
					int e=obj.peek();
				}
				else {
					System.out.println("Data is empty");
				}
				break;
				
			case 4:
				if(!obj.is_empty()) {
					System.out.println("Enter data is print");
					obj.print_stack();
				}
				else
				{
					System.out.println("Data is print");
				}
			case 0:
				System.out.println("Existing");
				break;
				default:
					System.out.println("Wrong option selected");
					break;
			}
		}while(ch!=0);
		
		
	}
}

