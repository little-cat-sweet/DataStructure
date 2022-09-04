package JavaBasic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HongYun on 2022/2/5
 */

public class InterfaceTest {

    public static void main(String[] args) {
        List<Boy1> list = new ArrayList<>();

    }
}
class Boy1 implements Comparable<Boy1>{

    private String name;
    private Integer age;
    public Boy1(){

    }

    public Boy1(String name, Integer age) {
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
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Boy1)) return false;
        Boy1 boy1 = (Boy1) obj;
        return this.age.equals(boy1.age) && this.name.equals(boy1.name);
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ", and my age is " + this.age;
    }

    @Override
    public int compareTo(Boy1 o) {
        return this.age - o.age;
    }
}
