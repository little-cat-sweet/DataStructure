package HongYun.Algorithm.SearchAlgorithm.DichotomisSearch;

import java.util.ArrayList;

//Return the all values which is enough to qualification.
public class DichomisSearchUp {
    public ArrayList search(int [] arr,int left,int right,int value){
        int mid=(left+right)/2;
        int midValue=arr[mid];
        if(left>right){
            ArrayList<Integer> arrayList=new ArrayList();
            arrayList.add(-1);
            return arrayList;
        }
        if(value>midValue){
            return search(arr,mid+1,right,value);
        }else  if(value<midValue){
            return search(arr,left,mid-1,value);
        }else {
            ArrayList<Integer> arrayList1=new ArrayList<>();
            int temp=mid-1;
            arrayList1.add(mid);
            while (temp >= 0 && arr[temp] == value) {
                temp -= 1;
                arrayList1.add(temp);

            }
            int temp1=mid+1;
            while (temp1 <= arr.length - 1 && arr[temp1] == value) {
                arrayList1.add(temp1);
                temp1 += 1;
            }
            return arrayList1;
        }
    }
}
