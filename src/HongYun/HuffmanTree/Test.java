package HongYun.HuffmanTree;

public class Test {
    public static void main(String[] args) {
        int [] arr={13,7,8,3,29,6,1};
        HuffmanTree huffmanTree=new HuffmanTree();
        Node node=huffmanTree.makeHuffmanTree(arr);
        huffmanTree.setRoot(node);
        huffmanTree.preOrder();

    }
}
