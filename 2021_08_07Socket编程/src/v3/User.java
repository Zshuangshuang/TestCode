package v3;


import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private String gender;

    public User(int id, String username, String gender) {
        this.id = id;
        this.username = username;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
