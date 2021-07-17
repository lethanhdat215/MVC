package models;

public class User {
    private String userName;
    private String password;
    private String address;
    private int age;

    public User() {

    }
    public User(String userName, String password, String address, int age) {
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

