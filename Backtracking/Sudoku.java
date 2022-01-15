package Backtracking;

import java.util.Scanner;

public class Sudoku
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] grid=new int[n][n];
        for (int i=0;i< grid.length;i++)
        {
            for (int j=0;j< grid[0].length;j++)
            {
                grid[i][j] = sc.nextInt();
            }
        }
        sudoku(grid,0,0);
    }
    public static void sudoku (int[][] grid, int row, int col)
    {
        if(row== grid.length)
        {
            for (int i=0;i< grid.length;i++)
            {
                for (int j=0;j< grid[0].length;j++)
                {
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
        }
        else if(col==grid[0].length)
        {
            sudoku(grid,row+1,0);
        }
        else
        {
            if(grid[row][col]==0)
            {
                for (int i=1;i<=9;i++)
                {
                    if (isItSafe(grid,row,col,i))
                    {
                        grid[row][col]=i;
                        sudoku(grid,row,col+1);
                        grid[row][col]=0;
                    }
                }
            }
            else
            {sudoku(grid,row,col+1);}
        }
    }
    public static boolean isItSafe(int[][] grid, int row, int col, int ele)
    {
        for (int i=0;i< grid.length;i++)
        {
            if (grid[i][col]==ele)
                return false;
        }
        for (int i=0;i< grid[0].length;i++)
        {
            if (grid[row][i]==ele)
                return false;
        }
        int r=row-row%3;
        int c=col-col%3;
        for (int i=r;i<r+3;i++)
        {
            for (int j=c;j<c+3;j++)
            {
                if (grid[i][j]==ele)
                    return false;
            }
        }
        return true;
    }
}
