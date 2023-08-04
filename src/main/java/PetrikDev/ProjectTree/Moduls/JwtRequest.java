package PetrikDev.ProjectTree.Moduls;

public class JwtRequest {
    private String username;
    private String password;

    // Alapértelmezett konstruktor
    public JwtRequest() {
    }

    // Konstruktor a username és password mezők inicializálásához
    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter metódus a felhasználónév (username) lekéréséhez
    public String getUsername() {
        return username;
    }

    // Setter metódus a felhasználónév (username) beállításához
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter metódus a jelszó (password) lekéréséhez
    public String getPassword() {
        return password;
    }

    // Setter metódus a jelszó (password) beállításához
    public void setPassword(String password) {
        this.password = password;
    }
}

