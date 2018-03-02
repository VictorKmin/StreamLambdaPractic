import java.util.Iterator;
import java.util.List;

public class DAO1 implements DAO {
    Database database = new Database();

    @Override
    public void save(int id) {
        database.getContactList().add(id, findOne(id));
    }

    @Override
    public void delete(int id) {
        List<Contact> contactList = database.getContactList();
        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact currenetContact = iterator.next();
            if (currenetContact.getId() == id ) {
                iterator.remove();
            }
        }
    }

    @Override
    public Contact findOne(int id) {
        Contact contact = new Contact();
       List<Contact> contactList = database.getContactList();
        Iterator <Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact cureentContact = iterator.next();
            if (cureentContact.getId() == id) {
                cureentContact = contact;
            }
        }
        return contact;
    }

    @Override
    public List<Contact> findAll() {
        return database.getContactList();
    }
}
