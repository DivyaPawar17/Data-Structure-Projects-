import java.util.Scanner;

public class Circular_Queue_Example
{
    int queue[],MaxSize,front,rear,count;
    void createQueue(int size)
    {
        rear=-1;
        front=0;
        MaxSize=size;
        count=0;
        queue=new int[MaxSize];

    }
    void enqueue(int element)
    {
        count++;
        rear=(rear+1)%MaxSize;
        queue[rear]=element;
    }
    boolean is_Full()
    {
        if(count==MaxSize)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        count--;
        int temp=queue[front];
        front=(front+1)%MaxSize;
        return(temp);
    }
    boolean is_Empty()
    {
        if(count==0)
            return true;
        else
            return false;
    }


    void print_queue()
    {
        int c=0,i=front;
        while(c<count)
        {
            System.out.print(queue[i]+"--");
            i=(i+1)%MaxSize;
            c++;
        }
    }

    public static void main(String args[])
    {
        int ch;
        Scanner in=new Scanner(System.in);
        Circular_Queue_Example obj=new Circular_Queue_Example();
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj.createQueue(size);//user given size :stack
        do
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(!obj.is_Full())//if not full then take data
                    {
                        System.out.println("Enter data to insert:");
                        int e=in.nextInt();
                        obj.enqueue(e);
                        System.out.println("Data to enqueued");
                    }
                    else {
                        System.out.println("Queue Full");
                    }
                    break;
                case 2:
                    if(!obj.is_Empty())//if not Empty then dequeue
                    {
                        int e=obj.dequeue();
                        System.out.println("Data dequeued:"+e);
                    }
                    else
                    {
                        System.out.println("Queue Empty");
                    }
                    break;
                case 3:
                    if(!obj.is_Empty())//if not Empty then print
                    {
                        System.out.println("Data in queue");
                        obj.print_queue();
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
        }while(ch!=0);
    }
}
