import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// public class MyArrayList {
//     public static void main(String[] args) {
//         ArrayList myList = new ArrayList();
//         myList.add("Navneet");
//         myList.add("Ravi");
//         myList.add(23);
//         myList.add(false);
//         myList.add(34.0f);
//         // System.out.println(myList.toArray());
//         Iterator list = myList.iterator();
//         while (list.hasNext()) {
//             System.out.println(list.next());
//         }
//     }
// }

class Student {
    private String name;
    private double rollNo;
    private String section;

    public Student(String name, double rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public double getRollNo() {
        return rollNo;
    }

    public String getSection() {
        return section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(double rollNo) {
        this.rollNo = rollNo;
    }

    public void setSection(String section) {
        this.section = section;
    }

}

public class MyArrayList {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Jake", 70, "Alpha"));
        list.add(new Student("Lori", 71, "Beta"));
        list.add(new Student("Sandy", 72, "Gamma"));

        for (Student student : list) {
            System.out
                    .println(student.getName() + " belongs to " + student.getSection() + " section and his roll no is "
                            + student.getRollNo());
        }
    }
}
