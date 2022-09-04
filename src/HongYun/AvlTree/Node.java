package HongYun.AvlTree;

public class Node {
    public int value;
    public Node(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
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
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
    public Node left;
    public Node right;
    //This is  basic preOrder(前序遍历) way of BinarySearchTree.
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null ){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
    //To find the targetNode.
    public Node findTargetNode(int value){
        if(this.value==value){
            return this;
        }
        if(this.value>value){
            if(this.left==null){
                return null;
            }else {
                return this.left.findTargetNode(value);
            }
        }else {
            if(this.right==null){
                return null;
            }else {
                return this.right.findTargetNode(value);
            }
        }
    }
    //To find the parent of targetNode.
    public Node findParent(int value){

        if((this.left!=null && this.left.value==value) || (this.right!=null && this.right.value==value) ){
            return this;
        }else if(this.left!=null && this.value>=value){
            return this.left.findParent(value);
        }else if(this.right!=null && this.value<value){
            return this.right.findParent(value);
        }else {
            return null;
        }
    }
    //The four way which is below this line will used in one AvlTree's function.
    //Get the leftTree's leftTree's height.
    public int leftLeftSmallTreeHeight(){
        if(this.left.left==null){
            return 0;
        }else {
            return this.left.left.height();
        }
    }
    //Get the leftTree's rightTree's height.
    public int leftRightSmallTreeHeight(){
        if (this.left.right==null){
            return 0;
        }else {
            return this.left.right.height();
        }
    }
    //Get the rightTree's leftTree's height.
    public int rightLeftSmallTreeHeight(){
        if(this.right.left==null){
            return 0;
        }else {
            return this.right.left.height();
        }
    }
    public int rightRightSmallTreeHeight(){
        if(this.right.right==null){
            return 0;
        }else {
            return this.right.right.height();
        }
    }

    //Get the leftTree's height.
    public int leftHeight(){
        if(this.left==null){
            return 0;
        }else {
            return this.left.height();
        }
    }
    //Get the rightTree's height.
    public int rightHeight(){
        if(this.right==null){
            return 0;
        }else {
            return this.right.height();
        }
    }
    //Get the height of the node which you use.
    public int height(){
        return Math.max(left==null ? 0:left.height(),right==null ? 0:right.height())+1;
    }
}
