import java.util.*;

class ArrayListExample {
    public static void main(String args[]){
ArrayList<String> items = new ArrayList<String>();
    items.add("Mango");
    items.add("Kiwi");
    items.add("Banana");
    items.add("Coconut");

    for(String item: items){
        System.out.println(item);
    }
    }
    
}