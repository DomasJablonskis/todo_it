package Data;

import model.Todo;

public class TodoItems {
    private static TodoItems[] items = new TodoItems[]{
    public int size(){
        return items.length;
    }
    public TodoItems[] findAll(){
        return items;
    }


    public TodoItems findById(int itemsId){
        //Iterate through array
        //Check if personId is the same as personId in array.
        //return found person

        for(int i =0; i< items.length; i++){
            if(itemsId == items[i].getItemsId()){
                return items[i];
            }
        }
        return null;
    }

    public void clear(){

    }
}
