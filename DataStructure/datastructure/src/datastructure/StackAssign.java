package datastructure;
import java.util.Scanner;
public class StackAssign {
	
	int stack[], maxSize, tos1, tos2;

	void create(int size) {
		tos1 = -1;
		maxSize = size;
		tos2 = maxSize;
		stack = new int[size];
	}

	void push1(int element) {
		tos1++;
		stack[tos1] = element;
	}

	void push2(int element) {
		tos2--;
		stack[tos2] = element;
	}

	int pop1() {
		int temp = stack[tos1];
		tos1--;
		return temp;
	}

	int pop2() {
		int temp = stack[tos2];
		tos1++;
		return temp;
	}

	boolean isFull1() {
		if (tos1 == tos2 - 1) {
			return true;
		} else
			return false;
	}

	boolean isFull2() {
		if (tos2 == tos1 + 1) {
			return true;
		} else
			return false;
	}

	boolean isEmpty1() {
		if (tos1 == -1) {
			return true;
		} else
			return false;
	}

	boolean isEmpty2() {
		if (tos2 == maxSize) {
			return true;
		} else
			return false;
	}
	
	void printStack1() {
		for(int i = tos1  ; i > -1  ;  i--) {
			System.out.println(stack[i]);
		}
	}
	
	void printStack2() {
		for(int i = tos2  ; i < maxSize  ;  i++) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StackAssign stack = new StackAssign();
		boolean exit = true;
		System.out.println("Enter the size of stack");
		int size = scanner.nextInt();
		stack.create(size);

		do {
			System.out.println(
					"1.To use Push1\n2.To use Push2\n3.To use Pop1\n4.To use Pop2\n5.Print Stack1\n6.Print Stack2\n7.Exit\n:");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				if (!stack.isFull1()) {
					System.out.println("Enter the data to use push1");
					int num = scanner.nextInt();
					stack.push1(num);
				} else {
					System.out.println("Stack 1 is full....");
				}
				break;
			case 2:
				if (!stack.isFull2()) {
					System.out.println("Enter the data to use push2");
					int num = scanner.nextInt();
					stack.push2(num);
				} else {
					System.out.println("Stack2 is full....");
				}
				break;
			case 3:
				if (!stack.isEmpty1()) {
					System.out.println("Data poped from pop1 is : " + stack.pop1());
				} else {
					System.out.println("Stack1 is empty");
				}
				break;
			case 4:
				if (!stack.isEmpty2()) {
					System.out.println("Data poped from pop1 is : " + stack.pop2());
				} else {
					System.out.println("Stack2 is empty");
				}
				break;
			case 5:
				System.out.println("Data from stack1 is");
				stack.printStack1();
				break;
			case 6:
				System.out.println("Data from stack2 is");
				stack.printStack2();
				break;
			case 7:
				exit = false;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid options....");
				break;
			}
		} while (exit);

	}

}
