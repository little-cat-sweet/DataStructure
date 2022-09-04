package HongYun.Algorithm.SortAlgorithm.InsertionAlgorithm;
//This is the class to solve the problem of InsertionAlgorithm.
public class InsertionAlgorithm {
    public int[] sort(int [] arr){
        int [] temp=new int[arr.length];
        temp[0]=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                //Consider the first'value of listArr is bigger than the insertion's value.
                if(arr[i]<=temp[0]){
                    int add=1;
                    int [] tempArr1=new int[i];
                    if (i - j >= 0) System.arraycopy(temp, 0, tempArr1, 0, i - j);
                    temp[0]=arr[i];
                    for (int value : tempArr1) {
                        temp[add] = value;
                        add = add + 1;
                    }
                    break;
                }
                //Consider the insertion's value is between the listArr's beforeValue and listArr's afterValue.
                if((temp[j]<arr[i] && temp[j+1]>=arr[i])){
                    int [] tempArr=new int[i-j-1];
                    System.arraycopy(temp, j+1, tempArr, 0, i - j-1);
                    temp[j+1]=arr[i];
                    for (int value : tempArr) {
                        temp[j + 2] = value;
                        j = j + 1;
                    }
                }
                if(j==i-1 && arr[i]>temp[j]){
                    temp[j+1]=arr[i];
                }

            }
        }
        //Consider the Insertion's value is bigger than the biggest's value of listArr.
        System.arraycopy(temp, 0, arr, 0, arr.length);
        return arr;
    }
}
