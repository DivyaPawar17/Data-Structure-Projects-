package datastructure;

import java.util.Scanner;

public class StackDecimalToBin {
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

	public static void main(String args[])   {
		
		Scanner sc=new Scanner(System.in);
		StackDecimalToBin obj=new StackDecimalToBin();
		System.out.println("16 bit system");
		int size = 16;
		obj.CreateStack(size);  // 16 bit stack
		
		 //read a number
		System.out.println("Enter number to convert");
		int num=sc.nextInt();
	
        //loop till number is not zero number%2(push in stack)  number/2
		while(num>0)
		{
			obj.push(num%2);
			num/=2;
		}

        //pop and print all data from stack
		while(!obj.is_Empty())
			System.out.println(obj.pop());
			
		
	}

}
