package HongYun.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        int [] arrInt={7,3,10,12,5,1,9,2};
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        for (int value : arrInt) {
            binarySearchTree.add(new Node(value));
        }
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(10));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(3));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(12));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(9));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(5));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(7));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(1));
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.delete(new Node(2));

    }
}
