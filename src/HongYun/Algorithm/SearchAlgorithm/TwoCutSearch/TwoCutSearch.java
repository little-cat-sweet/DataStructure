package HongYun.Algorithm.SearchAlgorithm.TwoCutSearch;

import java.util.Arrays;

//This is TwoCutSearch which is not by recursion.
public class TwoCutSearch {
    public int search(int target,int[] targetArr){
        //Before the search, you have to sort it.
        int[] arr=sort(targetArr);
        //Store the left of arr.
        int left=0;
        //Store the right of arr.
        int right=arr.length-1;
        while (left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
    //Sorting the arr. This is insertion method of SortAlgorithm..
    public static int[] sort(int[] targetArr){
        if(targetArr.length>1) {
            for (int insert = 1; insert < targetArr.length; insert++) {
                int insertValue=targetArr[insert];
                for(int insertIndex=insert-1;insertIndex>=0;insertIndex--){
                    if(insertValue<targetArr[insertIndex]){
                        targetArr[insertIndex+1]=targetArr[insertIndex];
                        targetArr[insertIndex]=insertValue;
                    }else {
                        break;
                    }
                }

            }
        }
        return targetArr;
    }

    public static void main(String[] args) {
        int [] arr={555,45,65,76,87,45};
        TwoCutSearch twoCutSearch=new TwoCutSearch();
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(twoCutSearch.search(5435,arr));
    }
}
