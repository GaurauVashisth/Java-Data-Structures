import java.util.*;

class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();
        names.add("Saurav");
        names.add("Lori");
        names.add("Gaurav");
        names.add("Priya");

        System.out.println(" names prints");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("adding and removing name");

        names.add("Jason Pissani");
        names.add("Mike");
        names.remove("Priya");
        for(String name:names){
            System.out.println(name);
        }

    }
}