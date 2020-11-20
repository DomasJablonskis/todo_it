package model.data;


import model.Todo;

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


}








