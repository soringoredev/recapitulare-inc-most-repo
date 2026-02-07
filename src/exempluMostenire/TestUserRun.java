package exempluMostenire;

public class TestUserRun {
    public static void main(String[] args) {

        User user = new User("user@gmail.com");
        user.changeEmail("nou@gmail.com");

        AdminUser admin = new AdminUser("admin@gmail.com");
        admin.forceEmailChange("fortat@gmail.com");

        System.out.println(user.getEmail());
        System.out.println(admin.getEmail());

    }
}
