import java.util.Scanner;

/**
 * @Author HongYun on 2022/6/7
 */

public class ACWING{

    static int N = 10010;
    static int M = N * 2;
    static int[] h = new int[N];
    static int index = 0;
    static int[] value = new int[M];
    static int[] next = new int[M];

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
    }

    private void insert(int a, int b){

        value[index] = b;
        next[index] = h[a];
        h[a] = index ++;
    }
}
