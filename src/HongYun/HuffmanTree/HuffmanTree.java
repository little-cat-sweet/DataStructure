package HongYun.HuffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//The Node has to implements Comparable, case you have to make a List which from the
//basic of java. And it will give you a way which named sort to make a the list of nodes
//list by min to max.
public class HuffmanTree  {
    Node root;
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node root){
        if(root==null){
            throw new NullPointerException("The root is null");
        }
        root.preList();
    }
    public Node makeHuffmanTree(int [] arr){
        //Store the nodes of arr.
        List<Node> nodes=new ArrayList<Node>();
        //Storing.
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        //The result of makeHuffmanTree is the only one node from list, and it is the
        //huffmanTree's top node. So the while's condition is nodes.size()>1;
        while (nodes.size()>1) {
            //Make the list of nodes sorted by min to max.
            Collections.sort(nodes);
            //The fistNode and secondNode to make a new node, case their value
            //is the most size of nodes's everyNode's value. This is the makeHuffmanTree's
            //core .
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            Node newNode = new Node(leftNode.value + rightNode.value);
            newNode.left=leftNode;
            newNode.right=rightNode;
            //Because the leftNode and rightNode have be the newNode's left and right.
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(newNode);
        }
        //After while the huffmanTree has been made.
        //return nodes.get(0) is return this huffmanTree.
     return nodes.get(0);
    }
}
