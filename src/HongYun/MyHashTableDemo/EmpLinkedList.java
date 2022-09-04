package HongYun.MyHashTableDemo;

import com.sun.source.tree.Tree;

public class EmpLinkedList {
    private  Emp head;
    //Default the add method is add the value to the LinkedList's last location.
    public void add(Emp emp){
        if(head==null){
            head=emp;
            return;
        }
        Emp temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=emp;

    }
    //Show the values of the LinkedList.
    public void list(){
        StringBuilder str= new StringBuilder();
        Emp temp= head;
        while (temp!=null){
            str.append(temp.toString());
            temp=temp.next;
        }
        System.out.println(str);
    }
    //Delete the value of the LinkedList.
    public void delete(int id){
        if(head==null){
            System.out.println("The empLinkedList is empty!");
            return;
        }
        Emp temp=head;
        if(id==head.id){
            if(temp.next==null){
                head=null;
                return;
            }
            EmpLinkedList empLinkedList=new EmpLinkedList();
            empLinkedList.head=temp.next;
            Emp temp1=empLinkedList.head;
            while (temp.next.next!=null){
                temp1.next=temp.next.next;
                temp=temp.next;
                temp1=temp1.next;
            }
            //Make the copied LinkedList to the old LinkedList.
            head= empLinkedList.head;
        }else {
            boolean flag=true;
            //Delete the value which its id equals the id.
            Emp temp4=head;
            while (temp4.next.id!=id){
                if(temp4.next.next!=null){
                    temp4=temp4.next;
                }else {
                    flag=false;
                    break;
                }
            }
            if(flag){
                temp4.next=temp4.next.next;
            }else {
                System.out.println("The id's value is not exist!");
            }
        }
    }
    public void update(int id,Emp emp){
        //Judge the LinkedList whether is empty!
        if(isEmpty()){
            System.out.println("No the value you want to update");
            return;
        }
        Emp temp=head;
        boolean flag=false;
        while (temp!=null){
            if(temp.id==id){
                flag=true;
                break;
            }else {
                temp=temp.next;
            }
        }
        if(flag) {
            temp.name = emp.name;
            temp.age = emp.age;
        }else {
            System.out.println("The value you want to update is not exist.");
        }

    }
    public boolean isEmpty(){
        return head==null;
    }

    public int search(Emp emp){
        if (isEmpty()){
            System.out.println("The value which you want to search is not exist.");
        }
        Emp temp=head;
        boolean flag=false;
        int i=0;
        while (true){
            if(temp.id==emp.id) {
                flag = true;
                break;
            }else {
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
            i=i+1;
        }
        if(flag){
            return i;
        }else {
            return -1;
        }
    }
}
