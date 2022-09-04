package HongYun.MyHashTableDemo;

public class EmpHashTable {
    private  int size;
    EmpLinkedList[] empHashTables;
    public EmpHashTable(int size){
        this.size=size;
        EmpLinkedList[] empHashTable=new EmpLinkedList[size];
        empHashTables=new EmpLinkedList[empHashTable.length];
        for(int i=0;i<size;i++){
            empHashTables[i]=new EmpLinkedList();
        }
    }
    public int SpreadFun(Emp emp){
        return emp.id%size;
    }
    public void add(Emp emp){
        int HashTableNo=SpreadFun(emp);
        empHashTables[HashTableNo].add(emp);
    }
    public void list(){
        for(int i=0;i<size;i++){
            if(empHashTables[i]==null){
                break;
            }
            empHashTables[i].list();
        }
    }
    public void delete(int id){
        int HashTableNo=id%size;
        empHashTables[HashTableNo].delete(id);
    }
    public void update(int id ,Emp emp){
        int HashTableNo=id%size;
        empHashTables[HashTableNo].update(id,emp);
    }
    public int search(Emp emp){
        int HashTableNo=SpreadFun(emp);
        return empHashTables[HashTableNo].search(emp);
    }
}
