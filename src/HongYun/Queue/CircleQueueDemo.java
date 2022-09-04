package HongYun.Queue;

public class CircleQueueDemo {
    public static void main(String[] args) {
        CircleQueue circleQueue=new CircleQueue(3);
        System.out.println(circleQueue.isEmpty());
        circleQueue.add(2);
        circleQueue.add(1);
        System.out.println(circleQueue.isEmpty());

        System.out.println(circleQueue.isFull());
        System.out.println(circleQueue.Size());

        circleQueue.showQueue();
        circleQueue.add(454);

    }
}
class CircleQueue{
    private int maxSize;
    //front指向组内第一个元素
    private int rear;
    //front指向组内第一个元素
    private int front;
    private int [] arr;
    //创建排序表
    public CircleQueue(int Size){
        maxSize=Size;
        arr=new int [maxSize];
    }
    //判断是否为空
    public boolean isEmpty(){
        return rear==front;
    }
    //判断是否为满；
    public boolean isFull(){
        return  (rear+1)%maxSize==front;
    }

    public void add(int n){
        if(isFull()){
            System.out.println("数组已经满了，无法添加！！");
            return;
        }
        arr[rear]=n;
        //因为它现在是环形的数组所以需要取模也就是取绝对值。！！！
        rear=(rear+1)%maxSize;
    }
    public int getQueue(){
        if(isEmpty()){
            System.out.println("队列为空，无法取出数据!!!");
        }
        //这里的取出数据其实就是取出队列的第一个。
        //要先创建一个临时变量用来临时保存要取出的元素，因为后面要将第一个元素删除，删除后就无法取出来了。
        int temp=arr[front];
        front=(front+1)%maxSize;
        return temp;
    }
    public void showQueue(){
        int end=0;
        int list;
        int show;
        String sentence;
        if(isEmpty()){
            System.out.println("队列为空哦，无法返回队列呢！！！");
        }
        //注意这是一个环形队列！！
        for(int i=front;front<(rear-front+maxSize)%maxSize;i++){
            list=i%maxSize;
            show=arr[i%maxSize];
            sentence="第"+list+"个元素为："+show+"。";
            System.out.println(sentence);
            end+=1;
            if(end==(rear-front+maxSize)%maxSize){
                System.out.println("结束");
                break;
            }
        }
    }
    public int Size(){
        return (rear-front+maxSize)%maxSize;
    }
}
