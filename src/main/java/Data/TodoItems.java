package Data;

import model.Todo;

public class TodoItems {
    private static TodoItems[] items = new TodoItems[0];


    public int size(){
        return items.length;
    }
    public TodoItems[] findAll(){
        return items;
    }


    public TodoItems findById(int itemsId){

        for(int i =0; i< items.length; i++){
            if(itemsId == items[i].getitemsId()){
                return items[i];
            }
        }
        return null;
    }

    private int getitemsId() {
        return 0;
    }

    public void clear(){

    }
}
