package HongYun.BinaryTree;

public class BinaryTree {
    private Node root;
    //This is the numbers of Node from this BinaryTree.
    private int size;
    public void setRoot(Node root) {
        this.root = root;
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
