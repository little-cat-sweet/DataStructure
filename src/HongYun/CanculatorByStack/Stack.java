package HongYun.CanculatorByStack;

public class Stack<T>{
    private int maxSize;
    private int top=-1;
    private Node<T> head;
    public Stack(){
        this.head=new Node<>();
    }
    public Stack(int maxSize){
        this.maxSize=maxSize-1;
        this.head=new Node<>();
    }
    public boolean isFull(){
        return top==maxSize;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(T x){
        if(isFull()){
            System.out.println("该类型栈已经满了！！！");
            return;
        }
        Node<T> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        top=top+1;
        temp.next= (Node<T>) x;
    }
    public T pop() {
        boolean flag = true;
        Node<T> conclusion = new Node<>();
        Node<T> temp = head;

        if (isEmpty()) {
            throw new RuntimeException("该类型栈为空，无法执行pop()");
        }
        //find the medium node,then it could delete the last node.
        while (true){
            if(temp.next.next!=null){
                temp=temp.next;
            }else {
                break;
            }
        }
        conclusion=temp.next;
        temp.next=null;
        top=top-1;
        return (T) conclusion;

    }
    //将栈中的元素全部展示
    public void show(){
        Node<T> temp=head.next;
        int i=0;
        if(isEmpty()){
            System.out.println("this stack is empty ,and can't make the show function!!!");
            return;
        }
        while (temp!=null){
            System.out.println("第"+i+"个的东西为："+temp.data.toString());
            temp=temp.next;
            i++;
        }
    }
    //judge the operation's priority!!
    public int priority(char operation){
        if(operation=='*' || operation=='/'){
            return 1;
        }else if(operation=='+' || operation=='-'){
            return 0;
        }else {
            return -1;
        }
    }
    //make the calculate'function come true!!
    public int cal(int num1,int num2,Character yourChoice){
        switch (yourChoice) {
            case '*':
                return num1 * num2;
            case '/':
                return num2 / num1;
            case '+':
                return num1 + num2;
            case '-':
                return num2 - num1;
            default:
                return -1;
        }
    }
    public int getSize(){
        int size=0;
        return size=this.top;
    }

    public char peek(){
        Node<T> temp=head;
        if(isEmpty()){
            throw  new NullPointerException("this is a empty stack!!!");
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        return (char) temp.data;
    }
    public boolean isSign(char  ch){
        return ch=='*'||ch=='/'||ch=='+'||ch=='-';
    }


}
