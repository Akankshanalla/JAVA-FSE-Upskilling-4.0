import java.util.*;
record Person(String name,int age){}
public class PersonRecord {
    public static void main(String[] a){
        List<Person> list=List.of(new Person("A",25),new Person("B",17));
        list.stream().filter(p->p.age()>18).forEach(System.out::println);
    }
}
