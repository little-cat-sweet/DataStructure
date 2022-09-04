package HongYun.Algorithm.SearchAlgorithm.FibonacciSearch;

import java.util.Arrays;
//The arr must be sorted.
//This is the class to solve the FibonacciSearch.
public class FibonacciSearch {
    //Make a Fibonacci list
    public static int maxSize=20;
    public static int [] fib(){
        int [] fib=new int[maxSize];
        fib[0]=1;
        fib[1]=1;
        for(int i=2;i<maxSize;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;
    }

    public int search(int [] arr,int value){
        int left=0;
        int right=arr.length-1;
        int k=0;//Store the fibonacci's index.
        int mid=0;
        int f[]=fib();
        while (right>f[k]-1){
            k++;
        }
        int [] temp= Arrays.copyOf(arr,f[k]);
        int times=temp.length-arr.length;
        for (int i=0;i<times;i++){
            temp[temp.length-1-i]=arr[arr.length-1];
        }
        while (left<=right){
            mid=left+f[k-1]-1;
            if(value<temp[mid]){
                right=mid-1;
                k--;
            }else if(value>temp[mid]){
                left=mid+1;
                k-=2;
            }else {
                if(mid<=right){
                    return mid;
                }else {
                    return right;
                }
            }
        }
        return -1;
    }
}
