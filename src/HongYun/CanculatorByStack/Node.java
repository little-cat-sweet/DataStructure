package HongYun.CanculatorByStack;

public class Node <T>{
    public T data;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public Node(){
        this.data=null;
        this.next=null;
    }

}
