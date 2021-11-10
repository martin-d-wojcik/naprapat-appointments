package com.martinprojects.naprapatbooking.model;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class CustomersModel implements Serializable {
    @Id
    @Column(name = "person_number")
    private String personNumber;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;

    public CustomersModel() {}

    public CustomersModel(String personNumber, String firstName, String lastName, String phoneNumber, String email) {
        this.personNumber = personNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this. phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
