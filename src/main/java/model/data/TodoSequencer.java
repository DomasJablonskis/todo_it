package model.data;

public class TodoSequencer {


    protected static int toDoId = 0;


    public static int nextToDoId() {

        return ++toDoId;
    }

    public static void reset() {

        toDoId = 0;

    }

}
