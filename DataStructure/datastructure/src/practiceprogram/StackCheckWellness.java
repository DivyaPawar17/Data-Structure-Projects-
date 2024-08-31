package practiceprogram;

import java.util.Scanner;

public class StackCheckWellness {

	char stack[];
	int maxsize,tos;
	void craeteStack(int size)
	{
		tos = -1;
		maxsize=size;
		stack=new char[maxsize];
	}
	
	void push(char element)
	{
		tos++;
		stack[tos]=element;
	}
	boolean is_full()
	{
		if(tos==maxsize-1)
			return true;
		else
			return false;
	}
	
	char pop() {
		char temp=stack[tos];
		tos--;
		return(temp);
	}
	boolean is_empty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		StackCheckWellness obj = new StackCheckWellness();
		System.out.println("Enter word");
		String word=sc.next();
		obj.craeteStack(word.length());
		for(int i=0;i<word.length();i++) {
			char c= word.charAt(i);
			if(c=='{')
				obj.push(word.charAt(i));
			else if(c=='}') {
				if(obj.is_empty()==true) {
					System.out.println("Error: '}' unexpeced");
					flag = false;
					break;
				}
				else {
					char g=obj.pop();
				}
			}
		}
		if(!obj.is_empty())
		{
			System.out.println("Error: '}' expected");
		}
		else if(flag==true) {
			System.out.println("balanced");
		}
	}
}
