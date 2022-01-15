package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2
{
    public class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node()
        {
            this(0);
        }
    }
        private Node root;



        public void createTree (int[] preo, int[] ino)
        {
            root = createTree(preo, ino, 0, preo.length-1, 0, ino.length-1);
        }
        private Node createTree (int[] preo, int[] ino,int plo, int phi, int inlo, int inhi)
        {
            if (inlo>inhi)
            {
                return null;
            }
            else
            {
                Node r=new Node(preo[plo]);
                int idx=0;
                for (int i=inlo;i<=inhi;i++)
                {
                    if (ino[i]==r.data)
                    {
                        idx = i;
                        break;
                    }
                }
                r.left=createTree(preo, ino, plo+1, plo+idx-inlo, inlo,idx-1);
                r.right=createTree(preo, ino, plo+idx-inlo+1, phi, idx+1, inhi);
                return r;
            }

        }



        public void createTreeUsingLevelOrder(int[] a)
        {
            this.root= new Node(a[0]);
            Queue<Node> qu = new LinkedList();
            qu.add(root);
            int i=1;
            while (!qu.isEmpty())
            {
                Node n= qu.remove();
                if(i!=a.length && a[i]!=-1)
                {
                    Node ln=new Node(a[i]);
                    n.left=ln;
                    qu.add(ln);
                    i++;
                }
                if (i!=a.length && a[i]!=-1)
                {
                    Node rn=new Node(a[i]);
                    n.right=rn;
                    qu.add(rn);
                    i++;
                }
            }
        }
        private static int maxlevel;
        public void leftView()
        {
            maxlevel=-1;
            leftview(root, 0);
        }
        private void leftview(Node n, int level)
        {
            if (n==null)
                return;

            else
            {
                if (level>maxlevel)
                {
                    System.out.println(n.data+" ");
                    maxlevel=level;
                }
            }
            leftview(n.left,level+1);
            leftview(n.right,level+1);
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
}
