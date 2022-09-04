package HongYun.BinaryTree;

public class Node {
    public int id;
    public String name;
    //It's to make the BinaryTree's size.
    private int tempSize=1;
    //It signifies whether the node.next is leftType(前驱) or rightType(后继).
    public int leftType;
    public int rightType;

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Node left;
    public Node right;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //This is the preOrder's method.
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null) {
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
    //This is the midOrder's method.
    public void midOrder(){
        if(this.left!=null){
            this.left.midOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.midOrder();
        }
    }
    //This is the lasOrder's method.
    public void lasOrder(){
        if(this.left!=null){
            this.left.lasOrder();
        }
        if(this.right!=null){
            this.right.lasOrder();
        }
        System.out.println(this);
    }
    //This is the preSearch.
    public Node preSearch(int id) {

        if (this.id == id) {
            return this;
        }
        Node resNode = null;
        if(this.left!=null){
            resNode=this.left.preSearch(id);
        }
        if(resNode!=null){
            return resNode;
        }
        if(this.right!=null){
            resNode=this.right.preSearch(id);
        }
        return resNode;
    }
    //The midSearch of BinaryTree.
    public Node midSearch(int id){
        Node resNode=null;
        if(this.left!=null){
            resNode=this.left.midSearch(id);
        }
        if(resNode!=null){
            return resNode;
        }
        if(this.id==id){
            return this;
        }
        if(this.right!=null){
            resNode=this.right.midSearch(id);
        }
        return resNode;
    }
    //The lasSearch of BinaryTree.
    public Node lasSearch(int id){

        Node resNode=null;
        if(this.left!=null){
            resNode=this.left.lasSearch(id);
        }
        if(resNode!=null){
            return resNode;
        }
        if(this.right!=null){
            resNode=this.right.lasSearch(id);
        }
        if(resNode!=null){
            return resNode;
        }
        if (this.id==id){
            return this;
        }
        return null;
    }
    public void delete(int id){
        if(this.left!=null && this.left.id==id){
            if(this.left.left!=null&&this.left.right==null){
                this.left=this.left.left;
                return;
            }else if(this.left.left==null&&this.left.right!=null){
                this.left=this.left.right;
                return;
            }else {
                this.left=null;
            }
            return;
        }
        if(this.right!=null && this.right.id==id){
            if(this.right.left!=null&&this.right.right==null){
                this.right=this.right.left;
                return;
            }else if (this.right.left==null&&this.right.right!=null){
                this.right=this.right.right;
                return;
            }else {
                this.right=null;
            }
            return;
        }
        if(this.left!=null){
            this.left.delete(id);
        }
        if(this.right!=null){
            this.right.delete(id);
        }
    }
}