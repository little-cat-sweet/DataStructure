package HongYun.Algorithm.SearchAlgorithm.InsertSearch;
//This is the class to solve the InsertSearch.
//The arr must to be sort.
public class InsertValueSearch {
    public int search(int [] arr,int left,int right,int value){
        System.out.println("hello");
        int mid=left+(right-left)*(value-arr[left])/(arr[right]-arr[left]);
        int midValue=arr[mid];
        if(left>right||value<arr[0]||value>arr[arr.length-1]){
            return -1;
        }
        if(value>midValue){
            return search(arr,mid+1,right,value);
        }else if(value<midValue){
            return search(arr,left,mid-1,value);
        }else {
            return mid;
        }
    }

}
