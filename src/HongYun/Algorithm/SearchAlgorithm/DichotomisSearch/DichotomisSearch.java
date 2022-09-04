package HongYun.Algorithm.SearchAlgorithm.DichotomisSearch;

public class DichotomisSearch {
    //The arr must be sorted.
    public int search(int [] arr,int left,int right,int value) {
        int mid=(left+right)/2;
        int midValue=arr[mid];
        //Reuse the method to right.
        if(left>right){
            return -1;
        }
        if(value>midValue){
            return search(arr,mid+1,right,value);
        //Reuse the method to left.
        }else if(value<midValue){
            return search(arr,left,mid-1,value);
        }else {
            return mid;
        }

    }
}
