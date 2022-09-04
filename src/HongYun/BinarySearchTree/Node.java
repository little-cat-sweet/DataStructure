package HongYun.BinarySearchTree;

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

}
