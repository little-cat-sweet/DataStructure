package HongYun.Algorithm.SortAlgorithm.BubbleSortAlgorithm;

import java.util.Arrays;

public class Test {
    public int [] sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=0;
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Test test=new Test();
        int [] arr={1,34,45,65,67,6,768};
        System.out.println(Arrays.toString(test.sort(arr)));
    }
}
