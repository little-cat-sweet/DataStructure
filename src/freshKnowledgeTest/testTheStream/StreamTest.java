package freshKnowledgeTest.testTheStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * program: DataStructures
 * User: HongYun
 * Date:2021-09-09 10
 */
public class StreamTest {

    public List<Person> persons(){

        List<Person> list = new ArrayList<>();
        list.add(new Person("jack",65));
        list.add(new Person("mary",22));
        list.add(new Person("john",45));

        return list;
    }

    public List<Person> specialPersons(){
        return Arrays.asList(
                new Person("jack",65),
                new Person("mary",22),
                new Person("john",45),
                new Person("mary",22),
                new Person("john",45)
        );
    }
    public void testStreamFilter(List<Person> persons){

        List<Person> newList = persons.stream().filter(person -> person.getAge()>22).collect(Collectors.toList());

        for(Person person:newList){
            System.out.println(person.toString());
        }
    }

    public void testStreamDistinct(List<Person> persons){

        List<Person> newList = persons.stream().distinct().collect(Collectors.toList());
        for(Person person: newList){
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        List<Person> list = streamTest.specialPersons();

        for(Person person: list){
            System.out.println(person.toString());
        }
        System.out.println();
        streamTest.testStreamDistinct(list);
    }

}
