package Recursion;

public class Tower_Of_Hanoi
{
    public static void main(String[] args)
    {

        toh(3,'A', 'C', 'B');

    }
    public static void  toh(int n, char from, char to, char aux)
    {
        if(n == 0)
        {
            return;
        }
        else
        {
            toh(n-1,from,aux,to);
            System.out.println("Move a disc from "+from+" to "+to+" through "+aux);
            toh(n-1,aux,to,from);
        }

    }
}