package Tree;
import java.util.*;

import java.util.Scanner;

public class BinaryTree
{
    Scanner sc=new Scanner(System.in);
    class Node
    {
        int data;
        Node left;
        Node right;

        public Node (int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }
    private Node root;
    public void createTree()
    {
        root=createTree(null, false);
    }
    private Node createTree(Node parent, boolean isLC)
    {
        if (parent==null)
            System.out.println("Enter the data of root node:");
        else if (isLC)
            System.out.println("Enter the data of left child of "+parent.data+" :");
        else
            System.out.println("Enter the data of right child of "+parent.data+" :");

        int n=sc.nextInt();
        Node nn=new Node(n);

        System.out.println("Is there a left child of?"+n);
        boolean ist=sc.nextBoolean();
        if (ist)
           nn.left= createTree(nn, true);

        System.out.println("Is there a right child of?"+n);
        ist=sc.nextBoolean();
        if (ist)
            nn.right= createTree(nn, false);

        return nn;
    }

    public void display()
    {
        display(root);
    }

    private void display(Node n)
    {
        if(n == null)
        {
            return;
        }
        else
        {
            String s = "";
            if(n.left != null)
            {
                s = s + n.left.data;
            }
            s = s + " --> " + n.data +" <-- ";
            if(n.right != null)
            {
                s = s + n.right.data;
            }

            System.out.println(s);
            display(n.left);
            display(n.right);
        }
    }
    public int max()
    {
        return max(root);
    }
    private int max(Node n)
    {
        if (n==null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            int lmax=max(n.left);
            int rmax=max(n.right);
            return Math.max(lmax, Math.max(n.data, rmax));
        }
    }
    public boolean search(int ele)
    {
        return search(root, ele);
    }
    private boolean search(Node n, int ele)
    {
        if (n==null)
            return false;
        else
        {
            return n.data==ele || search(n.left, ele) || search(n.right, ele);
        }
    }
    public int size()
    {
       return size(root);
    }
    private int size(Node n)
    {
        if(n==null)
            return 0;
        else
        {
            return size(n.left)+size(n.right)+1;
        }
    }
    public int height()
    {
        return height(root);
    }
    private int height(Node n)
    {
        if(n==null)
            return -1;
        else
        {
            return Math.max(height(n.left),height(n.right)) + 1;
        }
    }
    public void levelOrder()
    {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty())
        {
            Node n=qu.remove();
            System.out.print(n.data+" ");
            if (n.left!=null)
            {
                qu.add(n.left);
            }
            if (n.right!=null)
            {
                qu.add(n.right);
            }
        }
    }
    public void levelByLevelOrder()
    {
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while (qu.size()!=1)
        {
            Node n=qu.remove();
            if(n==null)
            {
                System.out.println();
                qu.add(null);
            }
            else
            {
                System.out.print(n.data+" ");
                if (n.left!=null)
                {
                    qu.add(n.left);
                }
                if (n.right!=null)
                {
                    qu.add(n.right);
                }
            }

        }
    }
    public boolean isBalance()
    {
        return isBalance(root);
    }
    private boolean isBalance(Node n)
    {
        if(n==null)
            return true;
        else
        {
            boolean b1=false;
            if (Math.abs(height(n.left)-height(n.right))<=1)
                b1 = true;

            return isBalance(n.left) && isBalance(n.right) && b1;
        }
    }
    private class BalPair
    {
        boolean isBal = true;
        int ht=-1;
    }
    public boolean isBal2 ()
    {
        return isBal2(root).isBal;
    }
    private BalPair isBal2(Node n)
    {
        if (n == null)
            return new BalPair();
        else
        {
            BalPair b2 = isBal2(n.left);
            BalPair b3 = isBal2(n.right);
            BalPair b1 = new BalPair();
            b1.isBal = b2.isBal && b3.isBal && Math.abs(b2.ht-b3.ht) <= 1;
            b1.ht = Math.max(b2.ht, b3.ht)+1;
            return b1;
        }

    }
    public int diameter()
    {
        return diameter(root);
    }
    private int diameter(Node n)
    {
        if (n==null)
            return 0;
        else
        {
            int d1 = height(n.left)+height(n.right);
            return Math.max(Math.max(diameter(n.right),diameter(n.left)), d1);
        }

    }
    private class DiaPair
    {
        private int dia=0;
        private int height = -1;
    }
    public int diameter2()
    {
        return diameter2(root).dia;
    }
    private DiaPair diameter2(Node n)
    {
        if (n==null)
            return new DiaPair();
        else
        {
            DiaPair d2 = diameter2(n.left);
            DiaPair d3 = diameter2(n.right);
            DiaPair d1 = new DiaPair();
            d1.dia = Math.max(Math.max(d3.dia, d2.dia), d1.height + d2.height + 3);
            d1.height = Math.max(d1.height,d2.height)+1;
            return d1;
        }
    }




}
