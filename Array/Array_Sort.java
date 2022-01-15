package Array;

import java.util.Arrays;

public class Array_Sort
{
    public static void main(String args[])
    {
        int a[]={3,5,1,8,2,0};
        //System.out.println(a[3]);
        //System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.toString(selectionSort(a)));
        System.out.println(Arrays.toString(bubbleSort(a)));
        //System.out.println(Arrays.toString(insertionSort(a)));
        //swap(a,1,2);
    }
    public static int[] swap(int[] a,int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        return a;
    }
    public static int[] selectionSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int min=i;
                if(a[j]>a[i])
                {
                    min=j;
                }
                swap(a,min,j);
            }
        }
        return a;
    }
    public static int[] bubbleSort(int[] a)
    {
        for(int i=0;i< a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }
            }
        }
        return a;
    }
   public static int[] insertionSort(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0)
            {
                if(temp<a[j])
                {
                    a[j+1]=a[j];
                    j--;
                }
                else
                {break;}

            }
            a[j+1]=temp;
        }
        return a;
    }
}
