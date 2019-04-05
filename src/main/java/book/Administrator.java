package book;

public class Administrator {
    private String id;
    private String userName;
    private String password;

    public Administrator(String userName) {
        this.id = userName;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
