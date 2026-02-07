package exempluMostenire;

public class AdminUser extends User {


    public AdminUser(String email) {
        super(email); // apeleaza constructorul
    }

    public void forceEmailChange(String email) {
        this.email = email; // avem acces pt ca i protected in cl Parinte
    }
}
