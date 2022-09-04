package HongYun.Algorithm.SortAlgorithm.ChoiceSortAlgorithm;
//This class is the solution of ChoiceSortAlgorithm!
public class ChoiceSortAlgorithm {
    //The core method .
    public int[] sort(int[] arr){
        //To sign the test location
        int poke=0;
        int extractPoke=poke+1;
        for(int i=0;i<arr.length-1;i++){
            int [] temp=new int[arr.length-extractPoke];
            System.arraycopy(arr, extractPoke, temp, 0, temp.length);
            if(arr[poke]>arr[minIndex(temp)+extractPoke]){
                //Exchange the arr[poke]'s value to the arr[minIndex(temp)]
                int temp1=0;
                temp1=arr[minIndex(temp)+extractPoke];
                arr[minIndex(temp)+extractPoke]=arr[poke];
                arr[poke]=temp1;
            }
            poke=poke+1;
            extractPoke=extractPoke+1;
        }

        return arr;
    }
    //This method is to get the index of minimum's value.
    public int minIndex(int [] arr){
        int minIndex=0;
        int minValue=0;
        int beforeIndex=0;
        int afterIndex=beforeIndex+1;
        int [] tempArr=new int[arr.length];
        //Copy the arr's value to tempArr.
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
        for(int i=0;i<tempArr.length-1;i++){
            if(tempArr[beforeIndex]<tempArr[afterIndex]){
                int temp=0;
                temp=tempArr[beforeIndex];
                tempArr[beforeIndex]=tempArr[afterIndex];
                tempArr[afterIndex]=temp;
            }
            beforeIndex=beforeIndex+1;
            afterIndex=afterIndex+1;
        }
        minValue=tempArr[arr.length-1];
        int i=0;
        while (arr[i]!=minValue){
            i=i+1;
        }
        minIndex=i;
        return minIndex;
    }

}
