import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DAO1 dao1 = new DAO1();

        List<Contact> contactList = new ArrayList<>();

        Contact test1 = new Contact(1,"Igor",Company.APPLE, "Pupkin", "pupkin@com", "0676705260",Department.FACTORY);
        Contact test2 = new Contact(2,"Vasya", Company.INTEL, "Sidorov", "vasya@com", "0676708642", Department.SUPPORT);
        Contact test3 = new Contact(3,"Petya", Company.MICROSOFT, "Ivanov", "petya@com","0756395061", Department.TECH);
        Contact test4 = new Contact(2,"Vasya", Company.INTEL, "Sidorov", "vasya@com", "0676708642", Department.SUPPORT);

//        contactList.add(test1);
//        contactList.add(test2);
//        contactList.add(test3);
//        contactList.add(test4);
        dao1.save(1);

//        System.out.println(contactList);
//        dao1.delete(1);
        System.out.println(dao1.findAll());

    }

}
