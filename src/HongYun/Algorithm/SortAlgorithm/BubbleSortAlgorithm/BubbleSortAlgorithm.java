package HongYun.Algorithm.SortAlgorithm.BubbleSortAlgorithm;
//This class is the solution of SortAlgorithm.
//But it is not the final solution.
public class BubbleSortAlgorithm {
    public int[] sort(int[] arr){
        //Run the times of length-1.
        for(int i=0;i<arr.length-1;i++){
            int beforeIndex=0;
            int afterIndex=beforeIndex+1;
            for(int j=0;j<arr.length-1;j++){
                if(arr[beforeIndex]>arr[afterIndex]){
                    //The temp is that make the afterIndex's value exchange the beforeIndex's value come true.
                    int temp=0;
                    temp=arr[afterIndex];
                    arr[afterIndex]=arr[beforeIndex];
                    arr[beforeIndex]=temp;
                }
                beforeIndex=beforeIndex+1;
                afterIndex=afterIndex+1;


            }
        }
    return arr;
    }
}

