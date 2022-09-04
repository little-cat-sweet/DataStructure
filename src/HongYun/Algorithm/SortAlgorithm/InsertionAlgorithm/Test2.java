package HongYun.Algorithm.SortAlgorithm.InsertionAlgorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[]arr={34,2,566,38,1};
        InsertionAlgorithmUp insertionAlgorithmUp=new InsertionAlgorithmUp();
        insertionAlgorithmUp.sort(arr);
        System.out.println(Arrays.toString(arr));
     }
}
