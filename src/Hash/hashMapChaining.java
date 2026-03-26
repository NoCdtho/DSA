package Hash;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class hashMapChaining<k,v> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public hashMapChaining(){
        list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(new LinkedList<>());
        }
    }

    public void put(k key, v value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity: entities){
            if(entity.key.equals(key)){
                entity.value =  value;
                return;
            }
        }

        if((float)(size) / list.size() > lf){
            reHash();
        }

        entities.add(new Entity( key,  value));

        size++;
    }

    public void reHash(){
        System.out.println("we are now rehashing.");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size = 0;

        for(int i = 0; i < old.size() * 2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old) {
            for(Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

     public v get(k key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity: entities) {
            if(entity.key.equals(key)){
                return  entity.value;
            }
        }
        return null;
     }

     public void remove(k key){
         int hash = Math.abs(key.hashCode() % list.size());
         LinkedList<Entity> entities = list.get(hash);

         Entity target = null;

         for(Entity entity: entities) {
             if(entity.key.equals(key)) {
                 target = entity;
                 break;
             }
         }
         entities.remove(target);
         size--;
     }

     public boolean conatainKey(k key){
        return get(key) != null;
     }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entity> entities : list) {
            for(Entity entity: entities) {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(" , ");
            }
        }
        builder.append("}");

        return builder.toString();
    }

    private class Entity { //child class
        k key;
        v value;
        public Entity(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
}

