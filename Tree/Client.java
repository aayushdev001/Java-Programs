package Tree;

public class Client
{
    public static void main(String[] args)
    {
        // 100 true 80 true 70 false false true 60 false true 40 false false true 90 false true 50 false false
        BinaryTree bt=new BinaryTree();
        //bt.createTree();
        //bt.display();
        //System.out.println(bt.max());
//        System.out.println(bt.search(60));
//        System.out.println(bt.search(64));
        //System.out.println(bt.height());
        //bt.levelOrder();
        //System.out.println(bt.isBalance());
        //System.out.println(bt.isBal2());
       // System.out.println(bt.diameter());
       // System.out.println(bt.diameter2());
        int pre[] = {100,20,50,60,70,40,80,90};
        int in[] = {50,20,70,60,100,40,90,80};
        BinaryTree2 bt2= new BinaryTree2();
//        bt2.createTree(pre, in);
//        bt2.display();
        int a[]={100, 80, 90, 70, 60, -1, 50, -1, -1, -1, 40, -1, -1, -1, -1};
        bt2.createTreeUsingLevelOrder(a);
        bt2.display();
        bt2.leftView();
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {10,20,30,40,50,60,70};
//        bst.createTree(arr);
//        bst.display();
//        bst.range(20,60);
    }

}
