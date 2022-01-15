package Backtracking;

public class Queen_Kill
{
    public static void main(String[] args)
    {
        qk(new boolean[4][4],0,0,0,4,"");
    }
    public static void qk(boolean[][] board, int cr, int cc, int qpsf, int tq, String ans)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
        }
        else if(cc==board[0].length)
        {
            qk(board,cr+1,0,qpsf,tq,ans);
        }
        else if(cr==board.length)
        {
            return;
        }
        else
        {
            if(isItSafe(board,cr,cc))
            {
                board[cr][cc]=true;
                qk(board,cr,cc+1,qpsf+1,tq,ans+"q"+qpsf+"b"+cr+cc+" ");
                board[cr][cc]=false;
            }
            qk(board,cr,cc+1,qpsf,tq,ans);
        }
    }
    public static boolean isItSafe(boolean[][] board, int cr, int cc)
    {
        for(int i=0;i<cc;i++)
        {
            if(board[cr][i]==true)
                return false;
        }
        for (int i=0;i<cr;i++)
        {
            if (board[i][cc]==true)
                return false;
        }
        int r=cr;
        int c=cc;
        while(r>=0&&c>=0)
        {
            if (board[r][c]==true)
                return false;
            r--;
            c--;
        }
        r=cr;
        c=cc;
        while(r>=0 &&c<board[0].length)
        {
            if (board[r][c])
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
