package HW7;

public class UserController {
    private User user;
    private UserView view;

    public UserController(User user, UserView view){
        this.user = user;
        this.view = view;
    }

    public void setFirstName(String firstName){
        user.setFirstName(firstName);
    }

    public String getFirstName(){
        return user.getFirstName();
    }

    public void setLastName(String lastName){
        user.setLastName(lastName);
    }

    public String getLastName(){
        return user.getLastName();
    }

    public void setAge(int age){
        user.setAge(age);
    }

    public int getAge(){
        return user.getAge();
    }

    public void updateView(){
        view.printUserDetails(user.getFirstName(), user.getLastName(), user.getAge());
    }
}
