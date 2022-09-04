package freshKnowledgeTest.testTheLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-09 11
 */
public class LambdaTest {
    private String sayHello(){

        return "hello world";
    }

    private void testLambdaNormal(){
        List<Integer>  list = new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add((int) (Math.random()*100));
        }
        for(Integer value:list){
            System.out.println(value);
        }
        System.out.println();
        System.out.println();
        Collections.sort(list,(a,b)-> b-a);
        for(Integer value:list){
            System.out.println(value);
        }
    }

    private void sort(int [][] arr){
        Arrays.sort(arr,(o1,o2)->{
            if(o1[0]!=o2[0]){
                return o1[0] - o2[0];
            }else {
                return o2[1] - o1[1];
            }
        });
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int [][] arr =  {{1,2},{3,2},{0,3},{-2,4},{3,5}};
        LambdaTest lambdaTest = new LambdaTest();
//        lambdaTest.testLambdaNormal();
        lambdaTest.sort(arr);
    }
}
