package HongYun.BinaryTree;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Node node1=new Node(1,"jack");
        Node node3=new Node(3,"mary");
        Node node6=new Node(6,"bob");
        Node node8=new Node(8,"jackson");
        Node node20=new Node(20,"john");
        Node node14=new Node(14,"tom");
        node1.left=node3;
        node1.right=node6;
        node3.left=node8;
        node3.right=node20;
        node6.left=node14;
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.setRoot(node1);
        binaryTree.preOrder();
        ThreadBinaryTree threadBinaryTree=new ThreadBinaryTree();
        threadBinaryTree.setRoot(node1);
        threadBinaryTree.preThreadBinaryTree();
        System.out.println();
        System.out.println(node8.left);
        System.out.println(node8.right);
        threadBinaryTree.midListBinaryTree();


    }

}
