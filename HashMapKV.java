import java.util.*;  

public class HashMapKV {
    public static void printStudentsDetails(HashMap<Integer,String> st){
        for(Map.Entry student : st.entrySet()){
            System.out.println(student.getKey()+" , "+student.getValue());
        }
    }
    public static void main(String args[]) {
        HashMap<Integer,String> students = new HashMap<Integer,String>();
        students.put(1,"Ravi"); // Add item in the hashmap
        students.put(2,"Rahul");
        students.put(3,"Kaushal");
        students.put(4,"Vivek");
        printStudentsDetails(students);
    }
}