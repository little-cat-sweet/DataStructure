package HongYun.Algorithm.SortAlgorithm.ChoiceSortAlgorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] arr=new int[6];
        arr[0]=879279;
        arr[1]=32443;
        arr[2]=234;

        arr[3]=3423;
        arr[4]=0;
        arr[5]=0;
        System.out.println(Arrays.toString(arr));
        ChoiceSortAlgorithm2 choiceSortAlgorithm2=new ChoiceSortAlgorithm2();
        choiceSortAlgorithm2.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(1);

    }
}
