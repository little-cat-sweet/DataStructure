package HongYun.Queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {

        ArrayQueue arrayQueue=new ArrayQueue(3);
        String key="";//接受用户输入;
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get)：从队列中取出数据");
            System.out.println("h(head)：查看队列头的数据");
            key=scanner.next();
            switch (key){
                case "s":
                    arrayQueue.showQueue();
                    break;
                case "a":
                    System.out.println("请输入一个数字");
                    int value=scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case "g":
                    try {
                        int res=arrayQueue.getQueue();
                        System.out.printf("取出的数据为%d\n",res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "h":
                    try {
                        int res1=arrayQueue.headQueue();
                        System.out.printf("队列的头是%d\n",res1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "e":
                    scanner.close();
                    loop=false;


            }



        }
        System.out.println("程序退出");
    }

}
//使用数组模拟队列，，编写一个ArrayQueue类
class ArrayQueue{
    private int maxSize;//最大容量。
    private int front;//队列尾。
    private int rear;//队列头。
    private int [] arr;//模拟队列的数组。

    public ArrayQueue(int arrMaxsize){
        maxSize=arrMaxsize;
        arr=new int[maxSize];
        front=-1;//front时指向队列头的前一个位置。
        rear=-1;//指向队队尾，执行队列尾（即就是队列最后一个数据）
    }

    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    //添加数据到队列

    public void addQueue(int n){
        //判断队列是否满。
        if(isFull()){
            System.out.println("队列漫，不能加入数据");
            return;
        }
        rear++;//让rear后移
        arr[rear]=n;

    }
    //获取数据。
    public int getQueue(){
        //判断队列是否为空.
        if(isEmpty()){
            //通过抛出异常来处理。
            throw new NullPointerException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列的所有数据。
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列空的,没有数据");
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d",i,arr[i]);
            System.out.println();
        }
    }
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列是空的，请问你在什么？？？？");
        }
        return arr[front+1];
    }


}