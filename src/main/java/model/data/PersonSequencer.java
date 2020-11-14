package model.data;

public class PersonSequencer {

    private static int personId = 0;


//Add a static method called nextPersonId that increment and return the next
//personId value.

    static int nextPersonId() {

        return ++personId;
    }

    static int reset() {
        return 0;
    }

}
