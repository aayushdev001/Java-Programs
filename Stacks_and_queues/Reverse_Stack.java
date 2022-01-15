package Stacks_and_queues;
import OOP.My_Stack;
public class Reverse_Stack
{
    public static void main(String[] args) throws Exception {

        My_Stack a= new My_Stack(5);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.display();
        //reverseUsingNewStack(a);
        //reverseWithoutUsingNewStack(a);
        actualReverseUsingOneAdditionalStack(a);
        a.display();
    }
    public static void reverseUsingNewStack(My_Stack a) throws Exception
    {
        My_Stack b=new My_Stack(a.size());
        while (a.size()>0)
        {
            int temp=a.pop();
            b.push(temp);
        }
        b.display();
//        a=b;
    }
    public static void reverseWithoutUsingNewStack(My_Stack a) throws Exception
    {
        if(a.isEmpty())
        {
            return;
        }
        else
        {
            int n=a.pop();
            reverseWithoutUsingNewStack(a);
            System.out.print(n+" ");
            a.push(n);
        }
    }
    public static void actualReverseUsingOneAdditionalStack (My_Stack a) throws Exception
    {
        My_Stack b=new My_Stack(a.size());
        while (!a.isEmpty())
        {
            b.push(a.pop());
        }
        actualReverseHelp(a,b);
    }
    public static void actualReverseHelp(My_Stack a, My_Stack b) throws Exception
    {
        if (b.isEmpty())
        {
            return;
        }
        else
        {
            int temp=b.pop();
            actualReverseHelp(a,b);
            a.push(temp);
        }
    }

}
