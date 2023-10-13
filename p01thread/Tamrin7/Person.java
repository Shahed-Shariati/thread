package org.example.thread.p01thread.Tamrin7;

public class Person {
    private Integer id;
    private String firstName;
    private String lastname;

    public Person(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }
}
