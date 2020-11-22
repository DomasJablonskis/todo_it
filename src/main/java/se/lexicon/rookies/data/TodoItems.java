package se.lexicon.rookies.data;


import se.lexicon.rookies.model.Todo;

public class TodoItems {

    private static Todo[] items = new Todo[0];

    public int size(){
        return items.length;
    }

    public Todo[] findAll(){
        return items;
    }

    public Todo findById(int itemId){

        for(int i =0; i< items.length; i++){
            if(itemId == items[i].getTodoId()){
                return items[i];
            }
        }
        return null;
    }

    public Todo[] findByDoneStatus (boolean doneStatus){

        Todo[] tempArray = new Todo[0];

        for (int i=0; i< items.length; i++){
            if (items[i].isDone() == doneStatus ){
                tempArray[i] = items[i];

            }
        }

        return tempArray;
    }

    public Todo[] findByAssignee (int personId){

        Todo[] objectArray = new Todo[0];


        for (int i=0; i< items.length; i++){
            if (personId == 1);
        }


        return null;

    }





}








