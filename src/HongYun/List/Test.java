package HongYun.List;

public class Test {
    public static void main(String[] args) {
        PersonNode personNode1=new PersonNode("jack",21);
        PersonNode personNode2=new PersonNode("mary",22);
        List list=new List();
        list.insert(personNode1);
        list.insert(personNode2);
        System.out.println(list.toString());
        list.delete(0);
        System.out.println(list.toString());
    }
}
