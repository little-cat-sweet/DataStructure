package HongYun.Algorithm.SortAlgorithm.InsertionAlgorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] arr=new int[6];
        arr[0]=34;
        arr[1]=324;
        arr[2]=3;
        arr[3]=3424;
        arr[4]=5;
        arr[5]=1;
        InsertionAlgorithm insertionAlgorithm=new InsertionAlgorithm();
        insertionAlgorithm.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
