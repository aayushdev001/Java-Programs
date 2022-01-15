package Stacks_and_queues;

import OOP.My_Queue;

import java.util.Queue;

public class Stacks_Using_Queue
{
    My_Queue st=new My_Queue(5);

    public boolean isFull()
    {
        if(st.isFull())
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if (st.isEmpty())
            return true;
        else
            return false;
    }
    public int size()
    {
        return st.size();
    }
    public void push(int ele) throws Exception
    {
        st.enqueue(ele);
    }
//    public int pop()
//    {
//
//    }

}
