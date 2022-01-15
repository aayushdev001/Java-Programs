package Recursion;

public class Vivek_Loves_Array
{
    public static void main(String[] args)
    {
        int a[]={3,3,3,3};
        System.out.println(right(a,1));
        System.out.println(left(a,1));
        System.out.println(f(a,0,a.length-1,0));
    }
    public static int f(int[] a, int si, int ei, int count)
    {
        int left=0;
        int right=0;
        for (int i=si;i<=ei;i++)
        {
            if(left(a,i)==right(a,i))
            {
                left=f(a,si,i,count+1);
                right=f(a,i+1,ei,count+1);
            }

        }
        return Integer.max(left,right);
    }
    public static int left(int[] a, int ele)
    {
        int sum=0;
        for (int i=0;i<=ele;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    public static int right(int[] a, int ele)
    {
        int sum=0;
        for (int i=ele+1;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
}
