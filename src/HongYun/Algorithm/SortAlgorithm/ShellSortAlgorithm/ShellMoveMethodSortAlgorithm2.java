package HongYun.Algorithm.SortAlgorithm.ShellSortAlgorithm;

import java.util.Arrays;

//This is not a class which you have to care, and it is just for practising whether I can code shellSort.
public class ShellMoveMethodSortAlgorithm2 {
    public void sort(int [] arr){
        //The loop time of group
        for(int i=arr.length/2;i>=1;i=i/2){
            for(int j=i;j<arr.length;j++){
                int poke = 0;
                int temp=arr[j];
                for(int m=j-i;m>=0;m=m-i){
                    if(temp<=arr[m]){
                        arr[m+i]=arr[m];
                        poke=m;
                    }else {
                        break;
                    }
                }
                if(arr[j]!=temp){arr[poke]=temp;}
            }
        }
    }

    public static void main(String[] args) {
        ShellMoveMethodSortAlgorithm2 shellMoveMethodSortAlgorithm2=new ShellMoveMethodSortAlgorithm2();
        int[] arr={4545,56,6577,67,545,56,56,77,7878};
        shellMoveMethodSortAlgorithm2.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }
}

