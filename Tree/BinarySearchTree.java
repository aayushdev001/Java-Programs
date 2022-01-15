package Tree;

public class BinarySearchTree
{
    class Node
    {
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
        public Node()
        {
            this(0);
        }
    }
    private Node root;
    public void createTree(int[] ino)
    {
        root = createTree(ino,0, ino.length-1);
    }
    private Node createTree(int[] ino, int si, int ei)
    {
        if (si>ei)
        {
            return null;
        }
        else
        {
            int mid=(si+ei)/2;
            Node n = new Node(ino[mid]);
            n.left=createTree(ino,si,mid-1);
            n.right=createTree(ino,mid+1,ei);
            return n;
        }
    }
    public void range(int a, int b)
    {
        range(root, a, b);
    }
    private void range(Node n, int a, int b )
    {
        if (n==null)
            return;
        else
        {
            if (n.data>a && n.data<b)
                System.out.println(n.data);

            range(n.left,a , b);
            range(n.right, a, b);
        }
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
