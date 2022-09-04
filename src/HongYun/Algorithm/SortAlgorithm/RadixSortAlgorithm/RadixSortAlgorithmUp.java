package HongYun.Algorithm.SortAlgorithm.RadixSortAlgorithm;
//This is teacher's way, but it's made a little difference to mine.
public class RadixSortAlgorithmUp {
    public void sort(int[] arr){
        //Get the max's value of arr, and to get the times of sort.
        int t1=arr[0];
        for(int t=1;t<arr.length;t++){
            if (t1<arr[t]){
                t1=arr[t];
            }
        }
        //Get the times of sort.
        int times=(t1+"").length();

        for(int sort=0,n=1;sort<times;sort++,n=n*10) {
            //Make the buckets.The number of buckets's list is its own index.
            int[][] buckets = new int[10][arr.length];
            //Make a parameter to note the quantity of each bucket.
            int[] elementCount = new int[10];
            //Put the element into bucket.
            for (int value : arr) {
                int element = value / n % 10;
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
