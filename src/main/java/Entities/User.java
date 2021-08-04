package Entities;

import javax.persistence.*;
import javax.validation.constraints.*;

public class User {

    @Size(min = 5, max = 45, message = "Khong duoc bo trong")
    private String firstName;

    @Size(min = 5, max = 45, message = "Khong duoc bo trong")
    private String lastName;

    @NotNull
    @Min(value = 18, message = "Tuoi sai roi")
    private int age;

    @NotEmpty(message = "Khong duoc bo trong")
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNumber;

    @NotEmpty(message = "Khong duoc bo trong")
    @Email
    private String email;


    public User( String firstName, String lastName, int age, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
