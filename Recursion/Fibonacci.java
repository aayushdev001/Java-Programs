package Recursion;

public class Fibonacci
{
    public static void main(String args[])
    {
        fib(0,1,5);
    }
    public static void fib(int a,int b, int n)
    {
        if(n<1)
        {
            return;
        }
        else
        {
            System.out.println(a);
            //System.out.println(b);
            fib(b,a+b,n-1);
        }

    }
}
