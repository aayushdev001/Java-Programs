package OOP;

public class My_Stack
{
    private int[] a;
   private int top;
    public My_Stack(int size)
    {
        a=new int[size];
        top=0;
    }
    public void push(int ele) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Stack Overflow");
        }
        a[top]=ele;
        top++;
    }
    public boolean isEmpty()
    {
        if (top==0)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if (top==a.length)
            return true;
        else
            return false;
    }
    public int peek()
    {
        return a[top-1];
    }
    public int size()
    {
        return top;
    }
    public int pop() throws Exception
    {
        if (isEmpty())
            throw new Exception("Stack underflow");
        else
            top--;
            return a[top];
    }
    public void display()
    {
        for (int i=top-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
