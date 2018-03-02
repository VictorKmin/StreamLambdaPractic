import java.util.List;

public interface DAO {
    void save(int id);
    void delete (int id);
    Contact findOne(int id);
    List<Contact> findAll();

}
