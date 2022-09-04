package HongYun.Algorithm.SortAlgorithm.MergeSortAlgorithm;


//This is the class to solve MergeSortAlgorithm.
public class MergeSortAlgorithm {
    public void sort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            //Cut off the left.
            sort(arr,left,mid,temp);
            //Cut off the right.
            sort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }

    }
    //Make the sortList into one.
    public static  void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        //At first make a list into the temp.
        while (i<=mid&&j<=right){
            if(arr[i]>arr[j]){
                temp[t]=arr[j];
                t+=1;
                j+=1;
            }else {
                temp[t]=arr[i];
                t+=1;
                i+=1;
            }
        }
        //The method below this line is to full of the temp by the rest list which has rest values.
        while (i<=mid){
            temp[t]=arr[i];
            t+=1;
            i+=1;
        }
        while (j<=right){
            temp[t]=arr[j];
            t+=1;
            j+=1;
        }
        //This is copy temp to newArr
        t=0;
        int tempLeft=left;
        while (tempLeft<=right){
            arr[tempLeft]=temp[t];
            t=t+1;
            tempLeft=tempLeft+1;
        }


}
}
