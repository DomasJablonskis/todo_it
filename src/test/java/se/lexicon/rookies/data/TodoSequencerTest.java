package se.lexicon.rookies.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoSequencerTest {

    @Before
    public void before() {
        TodoSequencer.toDoId = 0;
    }



    @Test
    public void test_nextToDoId() {
        //Arrange
        int expected = 46;

        TodoSequencer.toDoId = 45;


        //Act

        int actual = TodoSequencer.nextToDoId();



        //Assert
        assertEquals(expected, actual);



    }

    @Test
    public void test_reset() {
        //Arrange
        int expected = 0;
        int actual = 345567;

        TodoSequencer.toDoId = 45;


        //Act
        TodoSequencer.reset();
        actual = TodoSequencer.toDoId;




        //Assert
        assertEquals(expected, actual);

    }
}