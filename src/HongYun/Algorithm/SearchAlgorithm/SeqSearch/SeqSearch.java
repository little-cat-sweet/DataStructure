package HongYun.Algorithm.SearchAlgorithm.SeqSearch;
//This is the class to solve the SeqSearch.
public class SeqSearch {
    public int search(int [] arr,int value){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
