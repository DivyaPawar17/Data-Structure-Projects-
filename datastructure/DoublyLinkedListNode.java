package datastructure;

import java.util.Scanner;

	class DNode {
		int data;// information
		DNode left,right;// ref to next node

		DNode(int data) {
			this.data=data;
			left=right = null;
		}
	}

	public class DoublyLinkedListNode {
		DNode root;

		void createList() {
			root = null;
		}

		void insert_Left(int e) {
			// create a node
			DNode n = new DNode(e);
			if (root == null)// not created but assigned
				root = n;
			else {
				n.right=root;
				root.left=n;// 1 1000
				root = n;// 2 800
			}

		}

		void delete_Left() {
			if (root == null)
				System.out.println("List empty");
			else {
				DNode t = root;// 1 
				root = root.right;
				root.left=null;
				System.out.println(t.data + "Deleted");
			}

		}

		void insert_right(int e) {
			DNode n = new DNode(e);
			if (root == null)// not created but assigned
				root = n;
			else {
				DNode t = root;// 1
				while (t.right != null)// 2
				{
					t = t.right;
				}
				t.right = n;// 3
				n.left=t;
			}
		}

		void delete_Right() {
			if (root == null)// linked list not created
				System.out.println("List empty");
			else {
				DNode t, t2;
				t = t2 = root;// 1 temp
				while (t.right != null)// 2
					t = t.right;
				
				if (t == root)// only if 1 node exists
					root = null;
				else// if more than 1
					t2.left = null;// 3
				    t2.right=null;
				System.out.println(t.data + "Deleted");
			}

		}

		void print_List() {
			if (root == null)// linked list not created
				System.out.println("List empty");
			else {
				DNode t = root;
				while (t != null) {
					System.out.print("|" + t.data + "|->");
					t=t.right;
				}
			}
		}

		

		public static void main(String args[]) {
			int ch, e;
			Scanner in = new Scanner(System.in);
			DoublyLinkedListNode obj = new DoublyLinkedListNode();
			obj.createList();// user given size :stack
			do {
				System.out.println(
						"\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n0.Exit\n:");
				ch = in.nextInt();
				switch (ch) {
					case 1:
						System.out.println("Enter data:");
						e = in.nextInt();
						obj.insert_Left(e);
						System.out.println("Data to inserted");
						break;
					case 2:
						System.out.println("Enter data:");
						e = in.nextInt();
						obj.insert_right(e);
						System.out.println("Data to inserted");
						break;
					case 3:
						obj.delete_Left();
						break;
					case 4:
						obj.delete_Right();
						break;
					case 5:
						obj.print_List();
						break;
					
					case 0:
						System.out.println("Exiting.....");
						break;
					default:
						System.out.println("Wrong option selected");
						break;
				}
			} while (ch != 0);
		}
	}

