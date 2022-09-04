package HongYun.Algorithm.SortAlgorithm.ShellSortAlgorithm;
//Because the ShellSortAlgorithm is difficult , I decide just use teacher's method.
//This method is very stupid. It not only not develop the ShellSortAlgorithm's speed, but also
//slow down the ShellSortAlgorithm's speed!!!!.
//So there is the other way it is also in this package.
public class ShellExchangeMethodSortAlgorithm {
    public  void sort(int[] arr) {
        //Make the gap come true.
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        int temp = 0;
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
    }
}
