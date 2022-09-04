package HongYun.MyHashTableDemo;

public class Test {
    public static void main(String[] args) {
//        EmpLinkedList linkedList1=new EmpLinkedList();
        Emp emp=new Emp(1,"jack",21);
        Emp emp1=new Emp(2,"mary",22);
        Emp emp2=new Emp(10,"bob",23);
//        linkedList1.add(emp);
//        linkedList1.add(emp1);
//        linkedList1.list();
        EmpHashTable empHashTable=new EmpHashTable(2);
        empHashTable.add(emp1);
        empHashTable.add(emp);
        empHashTable.add(emp2);
        empHashTable.list();
        System.out.println();
        empHashTable.delete(2);
        empHashTable.list();
        empHashTable.delete(10);
        System.out.println();
        empHashTable.list();
        System.out.println();
        Emp emp3=new Emp(1,"亚索",55);
        empHashTable.update(emp3.id,emp3);
        empHashTable.list();
        Emp emp4=new Emp(1,"亚索",55);
        System.out.println(empHashTable.search(emp4));
    }
}
