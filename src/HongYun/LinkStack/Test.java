package HongYun.LinkStack;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkStack linkStack=new LinkStack(5);
        String key="";
        boolean loop=true;
        Scanner scanner=new Scanner(System.in);
        while (loop){
            System.out.println("push:add node to the LinkStack!!");
            System.out.println("pop:cut one not to the LinkStack!!");
            System.out.println("show:show the LinkStack all node");
            System.out.println("exit:get out of this test machine!!");
            System.out.println("make your choice !!");
            key=scanner.next();
            switch (key){
                case "push":
                    System.out.println("please make a name ");
                    String name=scanner.next();
                    Node node=new Node(name);
                    linkStack.push(node);
                    break;
                case "pop":
                    try {
                        linkStack.pop();
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                case "show":
                    linkStack.show();
                    break;
                case  "exit":
                    scanner.close();
                    System.out.println("游戏结束！！");
                    loop=false;
                    break;
                default:
                    break;
            }

        }
        Node node=new Node("jack");
        linkStack.push(node);
        linkStack.show();

    }
}
