package LeedCode.Working.OutOfTime;
//This question has been solved actually, but it still out of time.

import java.util.HashMap;

public class SubArraysWithDistinct {
    public int subarraysWithKDistinct(int [] A,int K){
        int answerTimes=0;
        int left=0;
        for (int i = K-1; i < A.length; i++) {
            HashMap<Integer,Integer> map=new HashMap<>();
            if (i - left + 1 == K) {
                for(int j=left;j<=i;j++){
                    if(map.containsKey(A[j])){
                        map.replace(A[i],map.get(A[j])+1);
                    }else {
                        map.put(A[j], 1);
                    }
                }
                if (isTheSize(map, K)==0) {
                    answerTimes++;
                }
                if(i==A.length-1&&i-K+1!=left){
                    left++;
                    i=left+K-1;
                }
            } else {
                for(int j=left;j<=i;j++){
                    if(map.containsKey(A[j])){
                        map.replace(A[j],map.get(A[j])+1);
                    }else {
                        map.put(A[j], 1);
                    }
                }
                if (isTheSize(map, K)==0) {
                    answerTimes++;

                } else if(isTheSize(map,K)<0){
                    i = left + K - 2;
                    left=left+1;
                }
                if(i==A.length-1&&i-K+1!=left){

                    i=left+K-1;
                    left++;
                }
            }
        }

        return answerTimes;
    }
    private int isTheSize(HashMap<Integer,Integer> map,int k){
        int compare=map.size();
        return k-compare;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,2,1};
        SubArraysWithDistinct t=new SubArraysWithDistinct();
        System.out.println(t.subarraysWithKDistinct(arr,2));
    }

}
