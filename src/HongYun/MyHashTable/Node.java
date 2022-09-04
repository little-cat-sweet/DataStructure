package HongYun.MyHashTable;

public class Node<T> {
    public T data;
    public Node<T> next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

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

    public Node(T data) {
        this.data = data;
    }

}
