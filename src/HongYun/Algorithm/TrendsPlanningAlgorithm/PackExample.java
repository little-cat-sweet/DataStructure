package HongYun.Algorithm.TrendsPlanningAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This is a use PackExample of TreadsPlanningAlgorithm...
public class PackExample {
    public static void main(String[] args) {
        int[] weight={1,4,3};
        int[] value={1500,3000,2000};
        HashMap<Integer,String> hashMap=new HashMap();
        hashMap.put(1500,"guitar");
        hashMap.put(2000,"stereo");
        hashMap.put(3000,"computer");
        int goods=weight.length;
        int weights=4;
        int resultValue=0;
        //Make the table's original.
        int [][] table=new int[goods+1][weights+1];
        //Make the first line of goods equals zero, and the weights too.
        for(int i=0;i<goods;i++){
            table[i][0]=0;
        }
        for(int i=0;i<weights;i++){
            table[0][i]=0;
        }
        //If the size of bag is larger than good's weight or equals the good's weight, you have to
        //Get the maxValue between the good's weight and the last bag's value add the lost's weight's
        //bag's value into the new location.
        //If the good's weight larger than the nowadays bag's weight, then just make the last bag's value
        //into this new location.
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[0].length;j++){
                if(weight[i-1]>j){
                    table[i][j]=table[i-1][j];
                }else {
                    table[i][j]=Math.max(value[i-1],table[i][j-1]+table[j-i][j]);
                }
            }
        }
        resultValue=table[goods][weights];
        boolean flag=false;
        for (int item : value) {
            if (resultValue == item) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("the result is "+hashMap.get(resultValue));
        }else {
            int i= (int) (Math.random()*3);
            int j=(int) (Math.random()*3);
            while (value[i]+value[j]!=resultValue){
                i=(int) (Math.random()*3);
                j=(int) (Math.random()*3);
            }
            System.out.println("one is " +hashMap.get(value[i]) +"  the other one is "+hashMap.get(value[j]));

        }
    }

}
