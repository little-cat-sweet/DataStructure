package HongYun.BinaryTree;

public class ArrBinaryTree {
    private  int [] arr;
    public ArrBinaryTree(int [] arr){
        this.arr=arr;
    }
    public void preOrder(int index){
        if(arr.length == 0|| arr==null){
            System.out.println("The ArrBinaryTree is not exist.");
            return;
        }
        System.out.println(arr[index]);
        if(2*index+1<arr.length){
            preOrder(2*index+1);
        }
        if(2*index+2<arr.length){
            preOrder(2*index+2);
        }

    }
    public void preOrder(){
        preOrder(0);
    }
}
