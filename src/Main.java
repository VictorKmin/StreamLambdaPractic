import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        DAO1 dao1 = new DAO1();

        List<Contact> contactList = new ArrayList<>();

        Contact test1 = new Contact(1,"Igor",Company.APPLE, "Pupkin", "pupkin@com", "0676705260",Department.FACTORY);
        Contact test2 = new Contact(2,"Vasya", Company.INTEL, "Sidorov", "vasya@com", "0676708642", Department.SUPPORT);
        Contact test3 = new Contact(3,"Petya", Company.MICROSOFT, "Ivanov", "petya@com","0756395061", Department.TECH);
        Contact test4 = new Contact(2,"Vasya", Company.MICROSOFT, "Sidorov", "avasya@com", "0676708642", Department.SUPPORT);
        Contact test5 = new Contact(5,"Kolya", Company.APPLE, "Harf", "dfq@com", "97402-193", Department.TECH);
        Contact test6 = new Contact(4,"Vasya", Company.INTEL, "Sidorov", "bvasya@com", "0676708642", Department.SUPPORT);
        Contact test7 = new Contact(4,"Vasya", Company.INTEL, "Sidorov", "cvasya@com", "0676708642", Department.SUPPORT);
        Contact test8 = new Contact(6,"Olya", Company.MICROSOFT, "Dz", "olga@com", "0676708642", Department.FACTORY);
        Contact test9 = new Contact(7,"Vasya", Company.APPLE, "Jia", "vasya@com", "0676708642", Department.FACTORY);


//        contactList.add(test1);
//        contactList.add(test2);
//        contactList.add(test3);
//        contactList.add(test4);
//        contactList.add(test5);
//        contactList.add(test6);
//        contactList.add(test7);
//        contactList.add(test8);
//        contactList.add(test9);
        dao1.save(test1);
        dao1.save(test2);
        dao1.save(test3);
        dao1.save(test4);
//
        contactList.add(dao1.findOne(1));

        System.out.println(contactList);

        Stream<Contact> stream = contactList.stream();

//            System.out.println("Всі унікальні");
//            List<Contact> nonRepeat = stream
                    // //Шукаю не повторні значення
//                    .distinct()
        //              //Закидаю їх в ліст
//                    .collect(Collectors.toList());
//            System.out.println(nonRepeat);

//        System.out.println("Унікальні з одного департамента");
//            List<Contact> nonRepeatInDept = stream
//                    .distinct()
        //              //Порівнюю всі контакти з тим, що б у них був сапорт
//                    .filter(contact -> contact.getDepartment() == Department.SUPPORT)
//                    .collect(Collectors.toList());
//        System.out.println(nonRepeatInDept);


//        System.out.println("Унікальні з dept а посортовані за email");
//        List<Contact> nonRepeatEmailSort = stream
//                .distinct()
//                .filter(contact -> contact.getDepartment() == Department.SUPPORT)
//                .sorted(Comparator.comparing(Contact::getEmail))
//                .collect(Collectors.toList());
//        System.out.println(nonRepeatEmailSort);


        System.out.println("Унікальні групуємо по компанії");
        List<Contact> groupedByIntel = stream
                //Шукаю однаковы значення
                .distinct()
                //По компаныї Інтел
                .filter(contact -> contact.getCompany() == Company.INTEL)
                //Закидаю їх в ліст
                .collect(Collectors.toList());
                //Виводжу
                System.out.println(groupedByIntel);

                // Перестворив стрім на test (Кидало помилку шо стрім завершено)
        Stream<Contact> test = contactList.stream();
         List<Contact> groupedbyAplle = test
                .filter(contact -> contact.getCompany() == Company.APPLE)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(groupedbyAplle);


        // Перестворив стрім на Hello. причина що і вище
        Stream<Contact> hello = contactList.stream();
        List<Contact> groupedByMS = hello
                .distinct()
                .filter(contact -> contact.getCompany() == Company.MICROSOFT)
                .collect(Collectors.toList());
        System.out.println(groupedByMS);


//        System.out.println(contactList);
//        dao1.delete(1);
//        System.out.println(dao1.findAll());
    }

}
