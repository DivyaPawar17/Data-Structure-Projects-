package interview;

public class Stack_delete_mid
{
    int stack[],MaxSize,tos;
    static int mid;
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
    void delete_mid()
    {
        if(tos> mid)
        {
            int temp = this.pop();
            if(this.tos==mid)
                return;
            else
                delete_mid();
            push(temp);
        }

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
    int peek()
    {
        return(stack[tos]);
    }

    void print_Stack()
    {
        for(int i=tos;i>-1;i--)
            System.out.println(stack[i]);
    }

    public static void main(String args[]) {
        Stack_delete_mid obj = new Stack_delete_mid();
        obj.createStack(10);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.print_Stack();
        Stack_delete_mid.mid=(obj.tos/2)-1;
        obj.delete_mid();
        obj.print_Stack();
    }
}
