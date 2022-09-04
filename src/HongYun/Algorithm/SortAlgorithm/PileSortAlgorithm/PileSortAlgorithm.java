package HongYun.Algorithm.SortAlgorithm.PileSortAlgorithm;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

//The premise of PileSortAlgorithm is that the BinaryTree must be big poke(大顶堆：二叉树上一个
// 结点大于下面的结点。)and the BinaryTree must is completely BinaryTree.
public class PileSortAlgorithm {
    public void pileSortAlgorithm(int [] arr){
        //To store the maxValue of bigPile.
        int temp=0;
        //Make the arr be the first bigPile.
        for(int i=arr.length/2+1;i>=0;i--){
            adjust(i,arr.length,arr);
        }
        for (int i=arr.length-1;i>0;i--){
            temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            adjust(0,i,arr);
        }
    }
    //Define the method that make the first BinaryTree be the bigPile, if you want to sort the
    //arr by max to min. If you want to get the arr by min to max, then just make a small BinaryTree.
    /*
    i is the parameter which is not the leave's node.
    length is the arr's length.
    arr is the arr which you want to sort.
     */
    public void adjust(int i,int length,int [] arr){
        int temp=arr[i];
        //i*2+1 is the i's leftNode.
        for(int k=i*2+1;k<length;k=k*2+1){
            if( k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }else {
                break;
            }
        }
        arr[i]=temp;
    }
}
