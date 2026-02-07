package exempluMostenire;

public class User {

    protected String email;

    public User(String email) {
        this.email = email;
    }

    public void changeEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }
}
