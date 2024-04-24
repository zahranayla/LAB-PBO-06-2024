package models;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter dan Setter untuk atribut username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Metode untuk memeriksa kecocokan kata sandi
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
