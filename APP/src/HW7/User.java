package HW7;

public class User {
    private int idUser;
    private String lastName;
    private String firstName;
    private int age;

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdUser() {
        return this.idUser;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
