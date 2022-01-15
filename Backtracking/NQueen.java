package Backtracking;

public class NQueen
{
    public static void main(String[] args)
    {
        //qp(new boolean[2][2],0,2,"");
        qc(new boolean[3][3],0,2,0,0,"");
    }
    public static void qp(boolean board[][], int qpsf, int tq, String ans)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
        }
        else
        {
            for(int i=0;i<board[0].length;i++)
            {
                for (int j=0;j<board.length;j++)
                {
                    if(board[i][j]==false)
                    {
                        board[i][j]=true;
                        qp(board,qpsf+1,tq,ans+"q"+qpsf+"b"+i+j+" ");
                        board[i][j]=false;
                    }
                }
            }
        }
    }
    public static void qc(boolean[][] board,int qpsf, int tq, int cr, int cc, String ans)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
        }
        else if(cc==board[0].length)
        {
            qc(board,qpsf,tq,cr+1,0,ans);
        }
        else if(cr==board.length)
        {
            return;
        }
        else
        {
            qc(board,qpsf+1,tq,cr,cc+1,ans+"q"+"b"+cr+cc+" ");
            qc(board,qpsf,tq,cr,cc+1,ans);
        }
    }
}
