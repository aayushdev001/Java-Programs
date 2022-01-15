package Linked_List;

public class Client
{
    public static void main(String[] args) {
        My_Linked_List ll=new My_Linked_List();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.display();
        ll.setAt(0,2);
        //ll.reverseRec();
        ll.display();
        //System.out.println(ll);
        //System.out.println(ll.head);
    }
}
