package se.lexicon.rookies.model;

public class Person {
    int personId;
    String firstName;
    String lastName;

    //Constructor for instating a object of Person
    public Person (int personId, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getPersonId() {
        return personId;
    }
    public void setPersonId() {
        this.personId = personId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName() {
        this.lastName = lastName;
    }
}