package HongYun.Algorithm.HuffmanCoding;

import com.sun.security.jgss.GSSUtil;

public class Node implements Comparable<Node>{
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", c=" + c +
                '}';
    }

    //Storing the Node's value in the HuffmanTree, and it is also the showTime's number of the Node's c.
    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
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

    public Node(int value, char c) {
        this.value = value;
        this.c = c;
    }

    //The char of a word in the str.
    public char c;
    public Node left;
    public Node right;

    @Override
    public int compareTo(Node o) {
        return this.value-o.value;
    }
    //Show the huffManTree.
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }

}
