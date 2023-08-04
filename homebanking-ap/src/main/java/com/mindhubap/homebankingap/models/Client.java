package com.mindhubap.homebankingap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Client {
    @Id
    String firstName;
    String lastName;
    String email;
    public Client(){

    }
    public Client(String first, String last, String e) {
        this.firstName = first;
        this.lastName = last;
        this.email = e;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
