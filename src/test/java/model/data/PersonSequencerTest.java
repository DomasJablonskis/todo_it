package model.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonSequencerTest {

    @Test
    public void nextPersonId() {
        // Arrange

        int expected = 1;


        // Act
        int actual = PersonSequencer.nextPersonId();


        // Assert

        assertEquals(expected, actual);

        // assert with your eyes ;)
        System.out.println("PersonSequencer.nextPersonId() expected = " + expected + ", actual = " + actual);

    }

    @Test
    public void reset() {
        assertTrue(true);
    }

    @Test
    public void testNextPersonId() {
    }

    @Test
    public void testReset() {
    }
}