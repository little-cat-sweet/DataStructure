package Acwing;
import java.util.*;
public class Main{

    static int n1, n2, m;
    static int N = 510;
    static int M = 10010;
    static int[] head = new int[N];
    static int[] match = new int[N];
    static int[] edges = new int[M];
    static int[] next = new int[M];
    static boolean[] visited = new boolean[N];
    static int index = 0;

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        Arrays.fill(head, -1);
        n1 = read.nextInt();
        n2 = read.nextInt();
        m = read.nextInt();
        while(m -- > 0){
            int left = read.nextInt();
            int right = read.nextInt();
            insert(left, right);
        }
        int res = 0;
        for(int i = 1; i <= n1; i ++){
            Arrays.fill(visited, false);
            if(findAGirl(i)) res ++;
        }
        System.out.println(res);
    }

    private static void insert(int left, int right){

        edges[index] = right;
        next[index] = head[left];
        head[left] = index ++;
    }

    private static boolean findAGirl(int boy){

        for(int i = head[boy]; i != -1; i = next[i]){
            int j = edges[i];
            if(! visited[j]){
                visited[j] = true;
                if(match[j] == 0 || findAGirl(match[j])){
                    match[j] = boy;
                    return true;
                }
            }
        }
        return false;
    }
}