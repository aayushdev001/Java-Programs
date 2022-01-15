package OOP;

public class My_Queue
{
    int[] a;
    int front;
    int size;
    public My_Queue(int capacity)
    {
        int a[]=new int[capacity];
        front=size=0;
    }
    public boolean isEmpty()
    {
        if (size==0)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if (size==a.length)
            return true;
        else
            return false;
    }
    public int size()
    {
        return size;
    }
    public void enqueue(int element) throws Exception
    {
        if (isFull())
            throw new Exception("Queue Overflow");
        else
        {
            a[(front+size)%a.length]=element;
            size++;
        }
    }
    public int dequeue() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("Queue Underflow");
        }
        else
        {
            int temp=a[front];
            front=(front+1)%a.length;
            size--;
            return temp;
        }
    }
    public void display()
    {
        for (int i=front;i<front+size;i++)
        {
            System.out.print(a[i%a.length]+" ");
        }
    }

}
