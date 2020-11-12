package model.data;

public class PersonSequencer {

    public static int personId = 0;

    static int nextPersonId(){


        return personId++;
    }




    static int reset(){

        return 0;
    }




}
