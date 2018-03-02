import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Database {
    private List<Contact> contactList = new ArrayList<>(100);

    public Database() {
    }

    public Database(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Database)) return false;
        Database database = (Database) o;
        return Objects.equals(getContactList(), database.getContactList());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getContactList());
    }

    @Override
    public String toString() {
        return "Database{" +
                "contactList=" + contactList +
                '}';
    }
}
