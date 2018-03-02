import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private Company company;
    private String surname;
    private String email;
    private String pnone;
    private Department department;

    public Contact() {}

    public Contact(int id,String name, Company company, String surname, String email, String pnone, Department department) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.surname = surname;
        this.email = email;
        this.pnone = pnone;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPnone() {
        return pnone;
    }

    public void setPnone(String pnone) {
        this.pnone = pnone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return getId() == contact.getId() &&
                Objects.equals(getName(), contact.getName()) &&
                getCompany() == contact.getCompany() &&
                Objects.equals(getSurname(), contact.getSurname()) &&
                Objects.equals(getEmail(), contact.getEmail()) &&
                Objects.equals(getPnone(), contact.getPnone()) &&
                getDepartment() == contact.getDepartment();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getCompany(), getSurname(), getEmail(), getPnone(), getDepartment());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company=" + company +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", pnone='" + pnone + '\'' +
                ", department=" + department +
                '}';
    }

}
