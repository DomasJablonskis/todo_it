package se.lexicon.rookies.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoTest {

    @Test
    public void getTodoId() {

        // Arrange
        int expected = 1;
        int actual;
        int toDoId = 1;
        String description = "create an object";

        // Act
        Todo todo = new Todo(toDoId, description);
        actual = todo.getTodoId();

        // Assert
        assertEquals(expected, actual);
        //System.out.println(getToDoId);
    }

    @Test
    public void setTodoId() {

        //Arrange
        int expected =1;
        int actual;
        int toDoId = 1;
        String description = "create an object";

        //Act
        Todo todo = new Todo(toDoId, description);
        actual = todo.setTodoId();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void setDescription() {
    }
}