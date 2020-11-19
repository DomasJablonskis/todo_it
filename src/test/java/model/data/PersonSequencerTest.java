package model.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonSequencerTest {

    @Test
    public void nextPersonId() {
        // Arrange
        int expected = 1;
        int expected1 = 2;

        // Act
        int actual = PersonSequencer.nextPersonId();
        int actual1 = PersonSequencer.nextPersonId();


        // Assert

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);

        // assert with your eyes ;)
        System.out.println("PersonSequencer.nextPersonId() expected = " + expected + ", actual = " + actual);

    }

    @Test
    public void reset() {
        assertTrue(true);
    }
}