package datastructure;
import java.util.Scanner;
public class QueueAssign {
	
	int queue[], maxSize, front1, rear1, front2, rear2;


	void createQueue(int size) {
		maxSize = size;
		queue = new int[maxSize];
		front1 = 0;
		rear1 = -1;
		front2 = maxSize - 1;
		rear2 = maxSize;

	}

	void enqueue1(int element) {
		rear1++;
		queue[rear1] = element;
	}

	int dequeue1() {
		int temp = queue[front1];
		front1++;
		return (temp);
	}

	void enqueue2(int element) {
		rear2--;
		queue[rear2] = element;
	}

	int dequeue2() {
		int temp = queue[front2];
		front2--;
		return (temp);
	}


	boolean is_Full() {
		if (rear2 == rear1 + 1)
			return true;
		else
			return false;
	}

	boolean is_Empty1() {
		if (front1 > rear1)
			return true;
		else
			return false;
	}

	boolean is_Empty2() {
		if (front2 < rear2)
			return true;
		else
			return false;
	}
	
	void print_queue1()
    {
        for(int i=front1;i<=rear1;i++)
            System.out.print(queue[i]+"--");
        System.out.println();
    }
	
	void print_queue2()
    {
        for(int i=front2;i>=rear2;i--)
            System.out.print(queue[i]+"--");
        System.out.println();
    }

	public static void main(String[] args) {

		int ch;
		Scanner in = new Scanner(System.in);
		QueueAssign obj = new QueueAssign();
		System.out.println("Enter size of queue:");
		int size = in.nextInt();
		obj.createQueue(size);// user given size :stack
		do {
			System.out.println(
					"1.To use enqueue1\n2.To use enqueue2\n3.To use dequeue1\n4.To use dequeue2\n5.Print queue1\n6.Print queue2\n0.Exit\n:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (!obj.is_Full())// if not full then take data
				{
					System.out.println("Enter data to insert:");
					int e = in.nextInt();
					obj.enqueue1(e);
					System.out.println("Data to enqueued");
				} else {
					System.out.println("Queue1 Full");
				}
				break;
			case 2:
				if (!obj.is_Full())// if not full then take data
				{
					System.out.println("Enter data to insert:");
					int e = in.nextInt();
					obj.enqueue2(e);
					System.out.println("Data to enqueued");
				} else {
					System.out.println("Queue2 Full");
				}
				break;
			case 3:
				if (!obj.is_Empty1())// if not Empty then dequeue
				{
					int e = obj.dequeue1();
					System.out.println("Data dequeued:" + e);
				} else {
					System.out.println("Queue Empty");
				}
				break;
			case 4:
				if (!obj.is_Empty2())// if not Empty then dequeue
				{
					int e = obj.dequeue2();
					System.out.println("Data dequeued:" + e);
				} else {
					System.out.println("Queue2 Empty");
				}
				break;
			case 5:
                if(!obj.is_Empty1())//if not Empty then print
                {
                    System.out.println("Data in queue1");
                    obj.print_queue1();
                }
                else
                {
                    System.out.println("Queue1 Empty");
                }
                break;
			case 6:
                if(!obj.is_Empty2())//if not Empty then print
                {
                    System.out.println("Data in queue2");
                    obj.print_queue2();
                }
                else
                {
                    System.out.println("Queue Empty");
                }
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


