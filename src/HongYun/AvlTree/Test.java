package HongYun.AvlTree;

import HongYun.BinarySearchTree.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        int[] arr={10,7,11,6,8,9};
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        for(int value:arr){
            binarySearchTree.add(new HongYun.BinarySearchTree.Node(value));
        }
        binarySearchTree.preOrder();
        System.out.println();
        AvlTree avlTree=new AvlTree();
        for (int value : arr) {
            avlTree.add(new Node(value));
        }

//        avlTree.add(new Node(56));
        System.out.println(avlTree.height());
        System.out.println(avlTree.leftHeight());
        System.out.println(avlTree.rightHeight());
//        System.out.println(avlTree.height());
//        System.out.println(avlTree.leftHeight());
//        System.out.println(avlTree.rightHeight());
//        avlTree.preOrder();
//        Node node=avlTree.getRoot();
//        System.out.println();
//        avlTree.preOrder();
        avlTree.preOrder();

        System.out.println("root:"+avlTree.getRoot());
        System.out.println("root.left:"+avlTree.getRoot().left);
        System.out.println("root.left.left:"+avlTree.getRoot().left.left);
        System.out.println("root.right:"+avlTree.getRoot().right);
        System.out.println("root.right.left:"+avlTree.getRoot().right.left);
        System.out.println("root.right.right:"+avlTree.getRoot().right.right);

    }
}
