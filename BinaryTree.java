import java.util.*;
class BTree{
    BTree left, right;
    int data;
    public BTree(){
        left = null;
        right = null;
        data = 0;
    }
    public BTree(int n){
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(BTree n){
        left = n;
    }
    public void setRight(BTree n){
        right = n;
    }
    public BTree getLeft(){
        return left;
    }
    public BTree getRight(){
        return right;
    }
    public void setData(int n){
        data = n;
    }
    public int getData(){
        return data;
    }
}
class BT{
    private BTree root;
    public BT(){
        root = null;
    }
    public boolean isEmpty(){
        return (root == null);
    }
    public void insert(int d){
        root = insert(root,d);
    }
    private BTree insert(BTree node, int d){
        if(node == null){
            node = new BTree(d);
        }
        else{
            if(node.getRight() == null){
                node.right = insert(node.right,d);
            }else{
                node.left = insert(node.left,d);
            }
        }
            return node;
    }
    public int countNodes(){
        return countNodes(root);
    }
    private int countNodes(BTree r){
        if(r==null){
            return 0;
        }else{
            int l = 1;
            l+=countNodes(r.left);
            l+=countNodes(r.right);
            return l;
        }
    }
    public boolean search(int data){
        return search(data,root);
    }
    public boolean search(int data, BTree r){
        if(r.getData()==data){
            return true;
        }
        if(r.getLeft()!=null){
            if(search(data,r.left)){
                return true;
            }
        }
        if(r.getRight()!=null){
        if(search(data,r.right)){
            return true;
        }
    }
    return false;
    }
    public void inorder(){
         inorder(root);
    }
    public void inorder(BTree r){
        if(r!=null){
        inorder(r.getLeft());
        System.out.println(r.getData());
        inorder(r.getRight());
        }
    }
    public void preorder(){
         preorder(root);
    }
    public void preorder(BTree r){
        if(r!=null){
        System.out.println(r.getData());
        preorder(r.getLeft());
        preorder(r.getRight());
        }
    }
    public void postorder(){
        postorder(root);
    }
    public void postorder(BTree r){
        if(r!=null){
        postorder(r.getLeft());
        postorder(r.getRight());
        System.out.println(r.getData());
        }
    }
}
public class BinaryTree{
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    BT bt = new BT();
    System.out.println("Binary Tree");
    int ch;
    do{
        
            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.Count");
            System.out.println("4.Empty?");
            System.out.println("5.Exit");
            System.out.println("6.Inorder Traversal");
            System.out.println("7.Preorder Traversal");
            System.out.println("8.Postorder Traversal");

            ch = sc.nextInt();
            switch(ch){
                case 1: 
                System.out.println("Enter the element to insert");
                bt.insert(sc.nextInt());
                break;
                case 2:
                System.out.println("What should be searched for?");
                System.out.println(bt.search(sc.nextInt()));
                break;
                case 3:
                System.out.println("Count is:"+bt.countNodes());
                break;
                case 4:
                System.out.println(bt.isEmpty());
                break;
                case 5:
                System.out.println("Exiting");
                break;
                case 6:
                System.out.println("Inorder");
                bt.inorder();
                break;
                case 7:
                System.out.println("Preorder");
                bt.preorder();
                break;
                case 8:
                System.out.println("Postorder");
                bt.postorder();
                break;
                default:
                System.out.println("Wrong entry");
            }   
    }while(ch!=5);
    }
}
