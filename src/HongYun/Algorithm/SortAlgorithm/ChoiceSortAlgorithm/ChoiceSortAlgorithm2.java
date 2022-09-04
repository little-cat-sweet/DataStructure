package HongYun.Algorithm.SortAlgorithm.ChoiceSortAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

//This is the teacher's way to solve the question of ChoiceSortAlgorithm.
public class ChoiceSortAlgorithm2 {
    public void sort(int [] arr){
        for(int j=0;j<arr.length-1;j++){
            int min=0;
            for(int i=j+1;i<arr.length;i++){
                if(arr[j]>arr[i]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }

    }
}
