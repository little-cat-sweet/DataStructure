package HongYun.HuffmanTree;

public class Node implements Comparable<Node>{
    public Node left;
    public int value;
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public Node right;

    @Override
    public int compareTo(Node o) {
        return this.value-o.value;
    }
    public void preList(){
        System.out.println(this.value);
        if(this.left!=null){
            this.left.preList();
        }
        if(this.right!=null){
            this.right.preList();
        }

    }
}
