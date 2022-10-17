package company.array_list;

import java.util.ArrayList;
import java.util.List;

public class TestListPerson {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Nguyễn Đức Thịnh 1");
        Person p2 = new Person(2, "Nguyễn Đức Thịnh 2");
        Person p3 = new Person(3, "Nguyễn Đức Thịnh 3");
        Person p4 = new Person(3, "Nguyễn Đức Thịnh 4");
        Person p5 = new Person(3, "Nguyễn Đức Thịnh 5");

        List<Person> listPerson = new ArrayList<Person>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        int count = 0;
        for (Person o : listPerson) {
            if (o.getId()==3) {
                count++;
            }
        }
        System.out.println(count);
    }
}


