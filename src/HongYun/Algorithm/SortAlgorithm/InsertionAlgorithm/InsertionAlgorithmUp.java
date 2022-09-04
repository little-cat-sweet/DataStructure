package HongYun.Algorithm.SortAlgorithm.InsertionAlgorithm;
//This is the teacher's way.I have to say that the teacher's way is much cleaner than mine.
//The teacher's method is just opposite to my method.He is find the last location to find the insertIndex,but my
//method is to find the first position to find the insertIndex.
public class InsertionAlgorithmUp {
    public void sort (int [] arr){
        //Get the new insertValue.
        for(int i=1;i<arr.length;i++){
        int insertValue=arr[i];
            int insertIndex = i - 1;
            //If out of this while's function ,and the insertValue has found the insertIndex.
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                //If the insertValue not find the insertIndex,then just make the insertIndex's value be the next
                //location's value.
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //If the insertValue find the insertIndex , then just insert the insertValue into the insertIndex's next
            //position.
            if(insertIndex+1!=i) {
                arr[insertIndex + 1] = insertValue;
            }

        }

    }
}
