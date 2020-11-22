package se.lexicon.rookies.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_getPersonId() {
        // Arrange
        // DataType variableName  = new Constructor();
       Person person1  = new Person(1, "Domas", "Jablonskis");

       // Act

        person1.getLastName();
        
        // Assert

        //If getFirstName is Domas then the test pass.
        assertEquals( "Jablonskis", person1.getLastName());
        //assertEquals( "Domas", person1.getLastName());


    }

    @Test
    public void setPersonId() {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

}