package HongYun.LinkStack;

public class LinkStack {
    private int maxSize;
    private int top;
    public LinkStack(int maxSize){
        this.maxSize=maxSize;
    }
    private Node head=new Node(null);
    public boolean isFull(){
        return top==maxSize;
    }
    public boolean isEmpty(){
        return head.next==null;
    }
    public void push(Node node){
        //先判断是否已经为空
        if(isFull()){
            System.out.println("栈已经满了！！！");
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        top=top+1;
    }
    public Node pop(){
        //先判断是否为空
        if(isEmpty()){
            throw  new  RuntimeException("the LinkStack is empty, you cant't make the pop function useful!!");
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        Node x=null;
        top=top-1;
        x=temp.next;
        temp.next=null;
        return x;

    }
    public void show(){
        //judge the LinkStack is empty or not ;
        if(isEmpty()){
            return;
        }
        Node temp=head;
        for(int i=0;i<top;i++){
            temp=temp.next;
            System.out.printf("第%d的元素为%s\n",i,temp.id);
        }
    }
}
