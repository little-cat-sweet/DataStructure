package HongYun.Algorithm.DivideConquar;

public class Hannoita {
    public static void main(String[] args) {
        hannoita(3,'A','B','C');
    }
    public static void hannoita(int num,char a,char b,char c){
        if(num==1){
            System.out.println("tower"+num+"from"+a+"to"+c);
        }else {
            hannoita(num-1,a,c,b);
            System.out.println("tower"+num+"from "+a+"to"+c);
            hannoita(num-1,b,a,c);
        }
    }
}
