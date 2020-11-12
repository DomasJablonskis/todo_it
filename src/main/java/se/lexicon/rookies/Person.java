package se.lexicon.rookies;

public class Person {

    int personId;
    String firstName;
    String lastName;

    public Person(int personId,String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
        this.personId = personId;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName= firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName= lastName;
    }
    public int getPersonId(){
        return personId;
    }
//Test test blablabla

}


