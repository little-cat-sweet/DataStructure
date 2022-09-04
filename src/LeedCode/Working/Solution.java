package LeedCode.Working;


import java.util.Arrays;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-06-02 08
 */
public class Solution {

    public void quickSort(int [] nums,int left,int right){

        if(left >= right){
            return;
        }
        int i = left-1;
        int j = right+1;
        int mid = nums[left+right>>1];
        while(i < j){
            do {
                i++;
            }while (nums[i] < mid);
            do {
                j--;
            }while (nums[j] > mid);

            if(i < j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        quickSort(nums,left,j);
        quickSort(nums,j+1,right);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] arr={9,4,1,7};
        solution.quickSort(arr,0,arr.length-1);
        int i = 1;
        System.out.println(i ++ + ++i);
        System.out.println(Arrays.toString(arr));
    }

}
