import java.util.List;

public interface DAO {
    void save(Contact contact);
    void delete (int id);
    Contact findOne(int id);
    List<Contact> findAll();

}
