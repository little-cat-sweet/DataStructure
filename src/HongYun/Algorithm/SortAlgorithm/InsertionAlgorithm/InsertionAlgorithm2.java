package HongYun.Algorithm.SortAlgorithm.InsertionAlgorithm;

import java.util.Arrays;

public class InsertionAlgorithm2 {
    public void sort(int[] arr){
        //Sorting time.
        for(int i=1;i<arr.length;i++){
            //Storing the insertValue.
            int value=arr[i];
            int insertIndex=findInertIndex(arr,i,value);
            //Move the values which are behind the insertIndex+1;
            if(insertIndex==i){
                arr[i]=value;
            }else {
                for (int j = i - 1; j >= insertIndex; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[insertIndex] = value;
            }
        }
    }
    //Using the cut way of two to find the index which is the value's insertionIndex.
    public static int findInertIndex(int [] arr,int size,int value ){
        int left=0;
        int right=size-1;
        int mid=0;
        while (left!=right){
            mid=(left+right)/2;
            if(value<arr[mid]){
                left=mid+1;
            }else if(value>mid){
                right=mid-1;
            }else {
                return mid+1;
            }
        }
        //The left=right.
        if(value<arr[left]){
            return left+1;
        }else if(value>arr[left]){
            return left;
        }else {
            return left+1;
        }

    }

    public static void main(String[] args) {
        InsertionAlgorithm2 insertionAlgorithm2=new InsertionAlgorithm2();
        int [] arr={342};
        System.out.println(InsertionAlgorithm1.findInertIndex(arr,arr.length,45));
        int [] arr1={342,45,56,7667,676,45,5646,56,345};
        insertionAlgorithm2.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
