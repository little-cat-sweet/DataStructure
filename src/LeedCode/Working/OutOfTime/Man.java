package LeedCode.Working.OutOfTime;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-17 22
 */
public class Man extends Person {


    public static void sayHello(){
        System.out.println("hello111");
    }

    @Override
    public void say() {
        System.out.println("hiiiiii");
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Man();
        person.say();
        person1.say();
        Man man = new Man();
        man.sayHello();

    }
}
