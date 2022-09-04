package HongYun.Algorithm.SortAlgorithm.BubbleSortAlgorithm;

import java.util.Arrays;

//This is the final solution of SortAlgorithm.
public class BubbleSortAlgorithmUp {
    public int[] sort(int[] arr){
        //To develop the rough solution.
        boolean flag=false;
        int[] tempArr1=new int[arr.length];
        //Run the times of length-1.
        for(int i=0;i<arr.length-1;i++){
            if(flag){
                break;
            } else {
                if(!Arrays.equals(arr, tempArr1)){
                    for(int m=0;m<arr.length;m++){
                        tempArr1[m]=arr[m];
                    }
                    int beforeIndex=0;
                    int afterIndex=beforeIndex+1;
                    for(int j=0;j<arr.length-1;j++){
                        if(arr[beforeIndex]>arr[afterIndex]){
                            //The temp is to make the afterIndex's value exchange the beforeIndex's value come true.
                            int temp=0;
                            temp=arr[afterIndex];
                            arr[afterIndex]=arr[beforeIndex];
                            arr[beforeIndex]=temp;
                        }
                        beforeIndex=beforeIndex+1;
                        afterIndex=afterIndex+1;
                    }
                }else {
                    flag=true;
                }

            }
//            int beforeIndex=0;
//            int afterIndex=beforeIndex+1;
//            for(int j=0;j<arr.length-1;j++){
//                if(arr[beforeIndex]>arr[afterIndex]){
//                    //The temp is to make the afterIndex's value exchange the beforeIndex's value come true.
//                    int temp=0;
//                    temp=arr[afterIndex];
//                    arr[afterIndex]=arr[beforeIndex];
//                    arr[beforeIndex]=temp;
//                }
//                beforeIndex=beforeIndex+1;
//                afterIndex=afterIndex+1;
//            }
        }
        return arr;}
    public String toString(int [] arr){
        //The value is receiver of result.
        String str="";
        for (int value : arr) {
            str = str + value + ",";

        }
        return str;

    }

}
