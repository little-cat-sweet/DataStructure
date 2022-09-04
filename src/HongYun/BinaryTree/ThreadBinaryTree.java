package HongYun.BinaryTree;

public class ThreadBinaryTree {
    private Node root;
    //This is the numbers of Node from this BinaryTree.
    private int size;
    private Node pre;
    public void setRoot(Node root) {
        this.root = root;
    }
    //Simplify the threadBinaryTree.
    public void midThreadBinaryTree(){
        midThreadBinaryTree(root);
    }
    //The midThreadBinaryTree method
    public void midThreadBinaryTree(Node node){
        //Judge the Node whether is null, If it is true, then just return;
        if(node==null){
            return;
        }
        //Thread the leftTree.
        if(node.left!=null){
            midThreadBinaryTree(node.left);
        }
        //Thread nowadays node.
        //Thread the leftType.
        if(node.left==null){
            node.left=pre;
            node.leftType=1;
        }
        //Thread the rightType.
        if(pre!=null&&pre.right==null){
            pre.right=node;
            pre.rightType=1;
        }
        //After handle the nowadays node, make the node equals pre.
        pre=node;

        //Thread the rightTree.
        if(node.right!=null){
            midThreadBinaryTree(node.right);
        }
    }
    //Simplifying the preThreadBinaryTree.
    public void preThreadBinaryTree(){
        preThreadBinaryTree(root);
    }
    //The preTheadBinaryTree method.
    public void  preThreadBinaryTree(Node node){
        //Judge the node whether is null, if it is true, then just return.
        if(node==null){
            return;
        }
        //Handle nowadays node.
        //Handle the node's leftType(前驱).
        if(node.left==null){
            node.left=pre;
            node.leftType=1;
        }
        //Handle the node's rightType(后继).
        if(pre!=null&&pre.right==null){
            pre.right=node;
            pre.rightType=1;
        }
        pre=node;
        //Handle the left(左树).
        if(node.leftType==0)
        {
            preThreadBinaryTree(node.left);
        }
        //Handle the right(右数).
        if(node.rightType==0)
        {
            preThreadBinaryTree(node.right);
        }
    }

    //The method to list the threadBinaryTree.
    public void midListBinaryTree(){
        Node node=root;
        while (node!=null){
            //First find the node which's leftType equals 1.
            while (node.leftType==0){
                node=node.left;
            }
            System.out.println(node);
            //If the node has rightType equals one, then print.
            while (node.rightType==1){
                //Get the node which is the node's right of node's rightType equals one.
                node=node.right;
                System.out.println(node);
            }
            node=node.right;

        }

    }

    //The preOrder of root.
    public void preOrder(){
        if(this.root!=null){
            root.preOrder();
        }else {
            System.out.println("This BinaryTree is not exist.");
        }
    }
    //The midOrder of root.
    public void midOrder(){
        if(this.root!=null){
            root.midOrder();
        }else {
            System.out.println("This BinaryTree is not exist.");
        }
    }
    //The lasOrder of root.
    public void lasOrder(){
        if(this.root!=null){
            root.lasOrder();
        }else {
            System.out.println("This BinaryTree is not exist.");
        }
    }
    //The preSearch of BinaryTree.
    public Node preSearch(int id){
        if(this.root!=null) {
            return root.preSearch(id);
        }else {
            System.out.println("This BinaryTree is null");
            return null;
        }
    }
    //The midSearch of BinaryTree.
    public Node midSearch(int id){
        if(this.root!=null) {
            return root.midSearch(id);
        }else {
            System.out.println("This BinaryTree is null");
            return null;
        }
    }
    //The lasSearch of BinaryTree.
    public Node lasSearch(int id){
        if (this.root!=null){
            return root.lasSearch(id);
        }else {
            System.out.println("This BinaryTree is null");
            return null;
        }
    }
    //Judge the BinaryTree whether is empty.
    public boolean isEmpty(){
        return root==null;
    }
    //Delete the value which you want to delete.
    public void delete(int id){
        if(isEmpty()){
            System.out.println("The BinaryTree is empty.");
            return;
        }
        if(this.root.id==id){
            this.root=null;
            return;
        }
        root.delete(id);
    }
}
