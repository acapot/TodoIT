package org.example;

import org.example.Sequencers.PersonIdSequencer;


import java.util.Objects;

public class Person {
  /*  id : int
- firstNmae: String
- lastName: String
- email : String*/

    private int id;
    private String firstname;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person(String firstname, String lastName, String email, AppUser credentials) {
      /*  if(id == 0){
            throw new RuntimeException("id was null");
        }*/
        setId();
        if(firstname == null){
            throw new RuntimeException("firstname was null");
        }

        if(lastName == null){
            throw new RuntimeException("lastname was null");
        }

        if(email == null){
            throw new RuntimeException("email was null");
        }

        // this.id = id;
        //id++; //id Autoincrement

        //this.firstname = firstname;
        setFirstname(firstname);

        //this.lasName = lasName;
        setLastName(lastName);

        //this.email = email;
        setEmail(email);

        setCredentials(credentials);
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = PersonIdSequencer.nextId();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
/*
    public String getSummary(){
        String result ="The id is: "+this.id + "\nThe Name is: " + this.firstname + " " + this.lastName +
    "\nThe email is : " + this.email;

        return result;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstname.equals(person.firstname) && lastName.equals(person.lastName) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, email);
    }
}
