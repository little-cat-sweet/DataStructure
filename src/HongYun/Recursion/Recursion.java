package HongYun.Recursion;

public class Recursion {
    public static void main(String[] args) {
        //test(4);
        System.out.println(fab(3));
    }
    public static void test(int n){
        if(n>2){
            test(n-1);
        }
        System.out.println("第"+n+"个人说你好！");
    }
    public static int fab(int n){
        if(n==1){
            return 1;
        }else {
             return  fab(n-1)*n;
        }

    }


}
