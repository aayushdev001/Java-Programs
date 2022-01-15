package Array;

public class ArraySwap
{
    public static void swap(int a[], int b[], int n)
    {
        int t=0;
        int i;
        for(i=0;i<n;i++)
        {
            t = a[i];
            a[i] = b[i];
            b[i] = t;
        }

    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        swap(a,b,4);
        for(int i=0;i<4;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<4;i++)
        {
            System.out.print(b[i]+"\t");
        }
    }

}
