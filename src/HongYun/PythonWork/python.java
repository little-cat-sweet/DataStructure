package HongYun.PythonWork;

import java.util.Arrays;

public class python {
    public static void main(String[] args) {

        python python1=new python();
        int[] arr={2,2,6};
        int result=0;
        result=python1.outProduct(arr);
        System.out.println(result);
    }
    public int outProduct(int [] arr){
        System.out.println(Arrays.toString(arr));
        int i=0;
        int j=1;
        int result=0;
        while (j<=arr.length-1){
            arr[j]=arr[j]*arr[i];
            j=j+1;
            i=i+1;
        }
        return arr[arr.length-1];
    }
}
