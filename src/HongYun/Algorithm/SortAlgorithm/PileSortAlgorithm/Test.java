package HongYun.Algorithm.SortAlgorithm.PileSortAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={4,6,8,5,9};
        int[] arr1={5,4,6,8,9,};
        PileSortAlgorithm pileSortAlgorithm=new PileSortAlgorithm();
        pileSortAlgorithm.adjust(1,arr.length,arr);
        System.out.println("The first sort"+ Arrays.toString(arr));
        pileSortAlgorithm.adjust(0,arr.length,arr);
        System.out.println("The second sort"+Arrays.toString(arr));
        System.out.println();
        pileSortAlgorithm.pileSortAlgorithm(arr);
//        PileSortAlgorithm pileSortAlgorithm=new PileSortAlgorithm();
//        pileSortAlgorithm.adjust(0,2,arr1);
    }
}
