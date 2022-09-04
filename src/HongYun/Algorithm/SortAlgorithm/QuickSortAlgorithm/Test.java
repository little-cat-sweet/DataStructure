package HongYun.Algorithm.SortAlgorithm.QuickSortAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={43535,555,5443,56,656,76,7657,76};
        QuickSortAlgorithmUp quickSortAlgorithmUp=new QuickSortAlgorithmUp();
        quickSortAlgorithmUp.sort(arr,0,arr.length-1);
        System.out.println("arr:"+ Arrays.toString(arr));
    }
}
