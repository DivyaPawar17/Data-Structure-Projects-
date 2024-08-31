import java.util.Scanner;

public class Stack_dec_to_bin
{
    int stack[],MaxSize,tos;
    void createStack(int size)
    {
        tos=-1;
        MaxSize=size;
        stack=new int[MaxSize];

    }
    void push(int element)
    {
        tos++;
        stack[tos]=element;
    }
    boolean is_Full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
    boolean is_Empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack_dec_to_bin obj=new Stack_dec_to_bin();
        System.out.println("16 bits system");
        int size=16;
        obj.createStack(size);//16 bit stack
        //read a number
        System.out.println("Enter number to convert");
        int no=in.nextInt();
        //loop till number is not zero number%2(push in stack)  number/2
        while(no>0)
        {
            obj.push(no%2);
            no=no/2;
        }
        //pop and print all data from stack
        while(!obj.is_Empty())
            System.out.print(obj.pop());

    }
}
