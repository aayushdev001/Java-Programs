package Linked_List;

import java.util.LinkedList;

public class My_Linked_List
{
    private class Node
    {
       int data;
       Node next;
       public Node(int data)
       {
           this.data=data;
           this.next=null;
       }
       public Node(int data, Node next)
       {
           this.data=data;
           this.next=next;
       }
    }
    public Node head;
    public boolean isEmpty()
    {
        return this.head == null;
    }
    public void addFirst(int ele)
    {
        Node n = new Node(ele, head);
        head = n;
    }
    public int size()
    {
//		return size;
        int s = 0;
        Node temp = head;
        while(temp != null)
        {
//			System.out.print(temp.data + " ");
            s++;
            temp = temp.next;
        }
        return s;
    }
    public void addLast(int ele)
    {
        if (head==null)
        {
            addFirst(ele);
        }
        else {
            Node temp = getNodeAt(size() - 1);
            Node n = new Node(ele);
            temp.next = n;
        }

    }
    public void addAt(int ele, int index)
    {
        Node temp=getNodeAt(index-1);
        Node n=new Node(ele,temp.next);
        temp.next=n;
    }
    public void setAt(int ele, int index)
    {
        Node temp=getNodeAt(index);
        temp.data=ele;
    }
    public int getFirst()
    {
        return head.data;
    }
    public int getLast()
    {
        Node temp=getNodeAt(size()-1);
        return temp.data;
    }
    public int getAt(int index)
    {
        Node temp=getNodeAt(index);
        return temp.data;
    }
    public int removeFirst() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Empty List");
        }
        int t = head.data;
        head = head.next;
        return t;
    }
    public int removeLast()
    {
        Node temp=getNodeAt(size()-2);
        int t=temp.next.data;
        temp.next=null;
        return t;
    }
    public int removeAt(int index)
    {
        Node temp = getNodeAt(index-1);
        int t = temp.next.data;
        temp.next = temp.next.next;
        return t;
    }
    public void reverse()
    {
        Node prev=null;
        Node curr=head;
        while (curr!=null)
        {
            Node ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        head=prev;
    }
    public void reverseRec()
    {
        reverseRec(null,head);
    }
    private void reverseRec(Node prev, Node curr)
    {
        if(curr==null)
        {
            head = prev;
            return;
        }
        else
        {
            reverseRec(curr,curr.next);
            curr.next=prev;
        }
    }
    public void reverseK(int k)
    {
        head=reverseK(head,k);
    }
    private Node reverseK(Node h, int k)
    {
        if (head==null)
        {
            return null;
        }
        else
        {
            int t=k;

        }
        int t = k;
        Node temp = h;

        while(t > 0 && temp != null)
        {
            temp = temp.next;
            t--;
        }
        Node prev=reverseK(temp,k);
        Node curr=h;
        while (curr!=temp)
        {
            Node ahead=curr.next;
            curr.next=prev;
            prev=curr;
        }
        return prev;

    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node middle()
    {
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static My_Linked_List merge(My_Linked_List l1, My_Linked_List l2)
    {
        Node i= l1.head;
        Node j = l2.head;
        My_Linked_List l3=new My_Linked_List();
        while(i!=null && j!=null)
        {
            if (i.data< j.data)
            {
                l3.addLast(i.data);
                i=i.next;
            }
            else
            {
                l3.addLast(j.data);
                j=j.next;
            }
        }
        while (i!=null)
        {
            l3.addLast(i.data);
            i=i.next;
        }
        while (j!=null)
        {
            l3.addLast(j.data);
            j=j.next;
        }
        return l3;
    }
    public void mergeSort()
    {
        My_Linked_List l=mergeSortHelper();
    }
    private My_Linked_List mergeSortHelper()
    {
        //if ()
        {

        }
        //else
        {
            Node mid=middle();
            My_Linked_List l1=new My_Linked_List();
            My_Linked_List l2=new My_Linked_List();
            l1.head=this.head;
            l2.head=mid.next;
        }
        return null;
    }
    public Node getNodeAt(int index)
    {
        Node temp=head;
        int s=0;
        while(s<index)
        {
           temp= temp.next;
           s++;
        }
        return temp;
    }

}
