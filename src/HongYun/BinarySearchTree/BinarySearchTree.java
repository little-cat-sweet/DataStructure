package HongYun.BinarySearchTree;

import java.util.Objects;

public class BinarySearchTree {
    public Node root;
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root = root;
    }
    public void add(Node node){
        //Judge the root whether is exist, if it doesn't exist, then just set root=node
        if(root==null){
            root=node;
            return;
        }
        //It like the linkedList's temp's function.
        Node temp=root;
        //Make the node which has two child to has one child or none.
        while (temp.left!=null && temp.right!=null){
            if(temp.value<node.value){
                temp=temp.right;
            }else {
                temp=temp.left;
            }
        }
        //This is the situation that the node's child is none.
        if(temp.left==null && temp.right==null){
            if(temp.value<node.value){
                temp.right=node;
            }else {
                temp.left=node;
            }
        }//This is the situation that the node which node has one child, and the child is on the node's left.
        //And in this situation, you have to do the method that if the addNode's value is larger than the node
        //which has one left child node just set the addNode to the node's right, except that if the addNode's value
        //is smaller or equals the node's left node, then just set the node to the node's left.
        else if(temp.left != null ){
            if(temp.value>=node.value){
                temp=temp.left;
                if(temp.value<node.value){
                    temp.right=node;
                }else {
                    temp.left=node;
                }
            }else {
                temp.right=node;
            }

        }else {
            //This is the situation that the node has a right child. And in this situation, you have to
            //do the method that if the addNode's value is smaller than the node which has a right child
            //, then just make addNode equals the node's left, if addNode is larger or equals the node's right
            //child node, then just make the node to the node's right.
            if (temp.value > node.value) {
                temp.left = node;
            } else {
                temp = temp.right;
                if (temp.value >= node.value) {
                    temp.left = node;
                } else {
                    temp.right = node;
                }
            }
        }
    }
    //This is preOrder(前序遍历)
    public  void  preOrder(){
        if(root==null){
            throw new  NullPointerException("This BinarySearchTree is not exist..");
        }
        root.preOrder();
    }
    //To find the TargetNode.
    public Node findTargetNode(int value){
        if(root==null){
            throw new NullPointerException("This binarySearchTree is not exist..");
        }
        return root.findTargetNode(value);
    }
    //To find the parentNode of TargetNode.
    public Node findParent(int value){
        if(root==null){
            throw  new NullPointerException("This BinarySearchTree's root is not exist..");
        } else {
            return root.findParent(value);
        }
    }
    //The condition of deletion has three conditions.
    //The first is that the targetNode is the leaveNode.
    //The second is that the targetNode has a childNode.
    //The third is that the targetNode has a two childNode.
    public void delete(Node targetNode){
        //Judge the root whether is exist.
        if(root==null){
            throw new NullPointerException("This binarySearchTree is not exist..");
        }else {
            //Get the node which you want to delete.
            Node target=findTargetNode(targetNode.value);
            if(target==null){
                throw new NullPointerException("The node which you want to delete is not exist..");
            }else {
                //This is the situation that the BinarySearchTree only has root node.
                if(root.left==null&&root.right==null){
                    root=null;
                    return;
                }
                //Get the targetNode's parentNode.
                Node parent=root.findParent(targetNode.value);
                //If the targetNode is the leaveNode.
                if(target.left==null&&target.right==null){
                    if(parent.left==target){
                        parent.left=null;
                    }else {
                        parent.right=null;
                    }
                }
                //If the targetNode has one childNode.
                //The condition has two situations. The first is that the childNode's location is
                //on the targetNode's left, the other situation is that the childNode's location is on
                //the targetNode's right.
                if((target.right!=null && target.left==null) || (target.left!=null&&target.right==null)){
                    //The childNode is on the targetNode's right. And you have to get location that the targetNode is
                    //on the its parent's left or right. And the location is the childNode's location.
//                    if (root == target) {
//                        if (target.right != null) {
//                            root = root.right;
//                            return;
//                        }
//                        root = root.left;
//                        return;
//                    }
                    if (parent != null) {
                        if (target.right != null) {
                            if (parent.left == target) {
                                parent.left = target.right;
                            }
                            if (parent.right == target) {
                                parent.right = target.right;
                            }
                        } else {
                            //The childNode is on the targetNode's right. And you have to get location that the targetNode
                            // is on the its parent's left or right. And the location is the childNode's location.
                            if (parent.left == target) {
                                parent.left = target.left;
                            }
                            if (parent.right == target) {
                                parent.right = target.left;
                            }
                        }
                    }else {
                        this.root = Objects.requireNonNullElseGet(target.left, () -> target.right);
                    }
                }
                //The targetNode has two childNode.
                //The method is that if the target is on the parent's right, and
                //you have to find the target's right or target's rightTree's most smallest Node, and
                //make it's value to exchange the target's value. In the end, just delete
                //the target's right or target's rightTree's most smallest Node.
                if(target.left!=null&&target.right!=null){
                    //Story the value of target's right or  target's rightTree's smallestNode.
                        Node temp=findTheSmallestNode(target.right);
                        Node parentOfSmallestNode =findParent(temp.value);
                        target.value=temp.value;
                        if(parentOfSmallestNode.left==temp){
                            parentOfSmallestNode.left=null;
                        }else {
                            parentOfSmallestNode.right=null;
                        }
                }
            }
        }
    }
    public Node findTheSmallestNode(Node node){
        //Because this function is only used in the function if deletion, So this function's
        //parameter is always exist, and you haven't need to judge the parameter whether is exist.
        if(node.left==null&&node.right==null){
            return node;
        }else if(node.left!=null){
            return findTheSmallestNode(node.left);
        }else {
            return null;
        }

    }
}
