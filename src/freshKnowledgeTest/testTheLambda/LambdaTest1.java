package freshKnowledgeTest.testTheLambda;

import java.util.Arrays;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-10 10
 */
//This is a test, which could ensure whether I could use lambda to simple phrase.
public class LambdaTest1 {

    public static void main(String[] args) {
        int [][] arr = {{2,3},{3,5},{4,5},{1,3},{2,1}};
        Arrays.sort(arr,(int[] a,int[] b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }else {
                return b[1]-a[1];
            }
        });
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
