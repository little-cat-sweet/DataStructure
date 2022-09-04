package freshKnowledgeTest.testTheStream;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-09 10
 */
public class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "My name is "+this.name+", and I am "+this.age+" years old.";
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(!(obj instanceof Person)) return false;
        Person person =(Person) obj;
        return  this.name.equals(person.name) && this.age.equals(person.age);
    }
}
