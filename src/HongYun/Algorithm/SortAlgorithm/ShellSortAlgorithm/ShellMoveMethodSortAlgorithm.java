package HongYun.Algorithm.SortAlgorithm.ShellSortAlgorithm;
//The developed method.

public class ShellMoveMethodSortAlgorithm {
    public void sort(int[] arr){
        for(int gap=arr.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                if(arr[j]<arr[j-gap]){
                    while (j-gap>=0 && temp<arr[j-gap]){
                        arr[j]=arr[j-gap];
                        j=j-gap;
                    }
                    if(arr[j]!=temp){
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
