package Data;

import model.Person;

public class People  {


    private static Person[] people = new Person[0];

    public int size(){
        return people.length;
    }
    public Person[] findAll(){
        return people;
    }
    //Created with teacher.

    public Person findById(int personId){
        //Iterate through array
        //Check if personId is the same as personId in array.
        //return found person

        for(int i =0; i< people.length; i++){
            if(personId == people[i].getPersonId()){
                return people[i];
            }
        }
        return null;
    }

    public void clear(){

    }





    }







