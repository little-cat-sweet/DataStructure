package HongYun.Algorithm.SortAlgorithm.RadixSortAlgorithm;

import java.util.Arrays;

//This is the to solve the RadixSortAlgorithm.
public class RadixSortAlgorithm{
    public void sort(int[] arr){
        //Get the max's value of arr, and to get the times of sort.
        int t1=arr[0];
        for(int t=1;t<arr.length;t++){
            if (t1<arr[t]){
                t1=arr[t];
            }
        }
        //Get the times of sort.
        int times=1;
        int size=10;
        while (t1/size%10!=0){
            times+=1;
            size*=10;
        }
        for(int sort=0;sort<times;sort++) {
            //Make the buckets.The number of buckets's list is its own index.
            int[][] buckets = new int[10][arr.length];
            //Make a parameter to note the quantity of each bucket.
            int[] elementCount = new int[10];
            //Put the element into bucket.
            for (int value : arr) {
                int element = (int) (value / Math.pow(10, sort) % 10);
                buckets[element][elementCount[element]] = value;
                elementCount[element]++;
            }
            //Put the element of buckets back to the arr, Then made the first sort.
            int m = 0;
            for (int j = 0; j < 10; j++) {
                int m1 = 0;
                if (elementCount[j] != 0) {
                    while (m <= arr.length) {
                        arr[m] = buckets[j][m1];
                        m1 += 1;
                        m += 1;
                        if (m1 == elementCount[j]) {
                            break;
                        }

                    }
                }
            }
            for (int cleaner = 0; cleaner < 10; cleaner++) {
                elementCount[cleaner] = 0;
            }
        }
    }
}
