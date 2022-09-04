package LeedCode.Working.OutOfTime;
import java.util.*;
/**
 * @Author HongYun on 2022/5/18
 */

public class Main {

    static int N = 100010;
    static int[] lPokes = new int[N];
    static int[] rPokes = new int[N];
    static int[] values = new int[N];
    static int index = 0;

    private static void insert(int location, int value){

        values[index] = value;
        lPokes[index] = location; rPokes[index] = rPokes[location];
        lPokes[rPokes[location]] = index; rPokes[location] = index ++;
    }

    private static void remove(int location){

        lPokes[rPokes[location]] = lPokes[location];
        rPokes[lPokes[location]] = rPokes[location];
    }

    public static void main(String[] args){

        lPokes[0] = 1;
        rPokes[1] = 0;
        index = 2;
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while(times -- > 0){
            String expression = scanner.next();
            char token = expression.charAt(0);
            if(token == 'L'){
                int value = scanner.nextInt();
                insert(0, value);
            }else if(token == 'R'){
                int value = scanner.nextInt();
                insert(lPokes[1], value);
            }else if(token == 'D'){
                int location = scanner.nextInt();
                remove(location + 1);
            }else if(expression.equals("IL")){
                int location = scanner.nextInt(); int value = scanner.nextInt();
                insert(lPokes[location + 1], value);
            }else{
                int location = scanner.nextInt(); int value = scanner.nextInt();
                insert(location + 1, value);
            }
        }
        for(int i = rPokes[0]; i != -1; i = rPokes[i]){
            System.out.print(values[i] + " ");
        }
    }
}
