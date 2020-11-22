package se.lexicon.rookies.model;

public class Todo {
    int todoId;
    String description;
    boolean done;
    Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId() {
        this.todoId = todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    };

}
