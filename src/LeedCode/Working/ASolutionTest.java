package LeedCode.Working;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-06-29 14
 */

public class ASolutionTest {

    public static void main(String[] args) {

//        int[] arr = {1,3,54,5,6,7,7,5,6,4};
//        int[][] arr1 = new int[4][2];
//        int index = 0;
//        for(int i = 0; i < arr1.length; i ++){
//            for(int j = 0; j < arr1[0].length; j ++){
//                arr1[i][j] = arr[index ++];
//            }
//        }
//        System.out.println("row is " + arr1.length);
//        System.out.println("column is " + arr1[0].length);
        int[] test = {0,0,0,0,1,0};
        int[][] test1 = new int[3][2];
        int index = 0;
        for(int i = 0; i < test1.length; i ++){
            for(int j = 0; j < test1[0].length; j ++){
                test1[i][j] = test[index ++];
            }
        }
        ASolutionTest a = new ASolutionTest();
        int res = a.numSpecial(test1);
        System.out.println(res);
    }
    public int numSpecial(int[][] mat) {

        int res = 0;
        for(int i = 0; i < mat.length; i ++){
            for(int j = 0; j < mat[0].length; j ++){
                if(mat[i][j] == 0) continue;
                if(isSpecial(mat, i, j)) res ++;
            }
        }
        return res;
    }

    private boolean isSpecial(int[][] mat, int row, int column){

        for(int i = 0; i < mat.length; i ++){
            if(i == row) continue;
            if(mat[i][column] == 1) return false;
        }
        for(int i = 0; i < mat[0].length; i ++){
            if(i == column) continue;
            if(mat[row][i] == 1) return false;
        }
        return true;
    }
}
