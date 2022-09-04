package LeedCode.SomeGoodAndSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-04-23 15
 */
public class LargestDivisibleSubset {
    //368
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 1) {
            List<Integer> first=new ArrayList<>();
            first.add(nums[0]);
            return first;
        }
        Arrays.sort(nums);
        int [] length=new int[nums.length];
        int [] fromLocation=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            int len=1;
            int location=i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0&&length[j]+1>len){
                    len=length[j]+1;
                    location=j;
                }
            }
            length[i]=len;
            max=Math.max(max,len);
            fromLocation[i]=location;
        }
        int resLocation=0;
        for(int i=0;i<length.length;i++){
            if(length[i]==max){
                resLocation=i;
                break;
            }
        }
        List<Integer> res=new ArrayList<>();
        while (res.size()!=max){
            res.add(nums[resLocation]);
            resLocation=fromLocation[resLocation];
        }

        return res;

    }
}
