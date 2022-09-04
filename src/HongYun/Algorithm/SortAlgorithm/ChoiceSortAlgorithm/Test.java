package HongYun.Algorithm.SortAlgorithm.ChoiceSortAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ChoiceSortAlgorithm choiceSortAlgorithm=new ChoiceSortAlgorithm();
        int[] arr=new int[6];
        arr[0]=3424;
        arr[1]=33;
        arr[2]=34;
        arr[3]=3435;
        arr[4]=546;
        arr[5]=1;
        choiceSortAlgorithm.sort(arr);
        System.out.println(Arrays.toString(arr));
//        int [] arr=new int[3];
//        arr[0]=342;
//        arr[1]=5;
//        arr[2]=24;
//        ChoiceSortAlgorithm choiceSortAlgorithm=new ChoiceSortAlgorithm();
//        System.out.println(choiceSortAlgorithm.minIndex(arr));
    }

}
