package HongYun.Stack;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack(20);
        boolean loop=true;
        String key="";
        Scanner scanner=new Scanner(System.in);
        while (loop){
            System.out.println("push: act the push's function!");
            System.out.println("exit: act the exit's function!");
            System.out.println("pop: act the pop's function");
            System.out.println("show: act the show's function");
            System.out.println("please make your choice!!!");
            key=scanner.next();
            switch (key){
                case "push":
                    System.out.println("please make a number");
                    int value=scanner.nextInt();
                    arrayStack.push(value);
                    break;
                case "exit":
                    scanner.close();
                    loop=false;
                    break;
                case "show":
                    arrayStack.show();
                    break;
                case "pop":
                    try {
                        int dd=arrayStack.pop();
                        System.out.println("取出的数据为："+dd);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                default:
                    break;
            }
        }
        System.out.println("the ware has been ended!!");
    }
}
