package HongYun.Stack;

import java.util.EmptyStackException;

//数组模拟栈
public class ArrayStack {
    //栈的顶部
    private int top=-1;
    private int arr[];
    //数组容量
    private int Maxsize;

    //构造器。
    public ArrayStack(int Maxsize){
        this.Maxsize=Maxsize;
        arr=new int[Maxsize];
    }
    //判断栈是否为满。
    public boolean isFull(){
        return top==Maxsize-1;
    }
    //判断栈是否为空。
    public boolean isEmpty(){
        return top==-1;
    }

    //入栈
    public void push(int i){
        //判断栈是否已经满。
        if(isFull()){
            return;
        }
        if(i<=0){
            System.out.println("输入的值应该大于一！！");
            return;
        }
        //找到第一个空的位置。
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                arr[j]=i;
                top=top+1;
                break;
            }
        }
   }
   //出栈的实现。
   public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈为空，无法执行 出栈哦");
        }
        int values=0;
        values=arr[top];
        arr[top]=0;
        top=top-1;
        return values;

    }
    public void show(){
        if(isEmpty()){
            throw  new RuntimeException("栈为空，无法执行显示的操作哟！！");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.printf("arr[%d]为:%d",i,arr[i]);
            }else {
                return;
            }

        }
    }

}
