package HW7;

public class MVCMain {
    public static void main(String[] args) {
        User model = userFromDatabase();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);
        controller.updateView();
        controller.setFirstName("John");
        controller.updateView();
    }

    private static User userFromDatabase() {
        User user = new User();
        user.setFirstName("Robert");
        user.setLastName("Pattinson");
        user.setAge(30);
        return user;
    }
}
