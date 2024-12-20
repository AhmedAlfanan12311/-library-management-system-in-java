public abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public abstract void displayRole();
}

class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }

    @Override
    public void displayRole() {
        System.out.println("Admin: " + username);
    }
}

class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }

    @Override
    public void displayRole() {
        System.out.println("Regular User: " + username);
    }
}

class UserFactory {
    public static User createUser(String role, String username) {
        switch (role) {
            case "Admin":
                return new AdminUser(username);
            case "Regular":
                return new RegularUser(username);
            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}
