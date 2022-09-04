package HongYun.DoubleWayListLinked;

public class test {
    public static void main(String[] args) {
        DoubleWayListLinked doubleWayListLinked=new DoubleWayListLinked();
        Node node1=new Node(1,"jack");
        Node node2=new Node(2,"mary");
        Node node3=new Node(3,"bob");
        Node node4=new Node(1,"apple");
        doubleWayListLinked.add(node1);
        doubleWayListLinked.add(node2);
        doubleWayListLinked.add(node3);
        doubleWayListLinked.list();
        doubleWayListLinked.delete(2);
        doubleWayListLinked.list();
        doubleWayListLinked.delete(3);
        doubleWayListLinked.list();
        doubleWayListLinked.delete(1);
        doubleWayListLinked.list();
        doubleWayListLinked.delete(54);
        doubleWayListLinked.list();


        DoubleWayListLinked doubleWayListLinked1=new DoubleWayListLinked();





    }
}
