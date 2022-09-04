package LeedCode;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test4 {
    public void  change(int [] arr) {
        arr[1]=0;
    }

    public static void main(String[] args) {
        String value="abc";
        System.out.println(value.substring(1,3));
        int [] arr={1,34,45,6,7,88,8,454,56,76,7,8,8,98,5546};
        Test4 test=new Test4();
        test.sort(arr);
    }
    private void sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        HashSet set=new HashSet();
        Hashtable hashtable=new Hashtable();
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        System.out.println(Arrays.toString(arr));
    }
}
