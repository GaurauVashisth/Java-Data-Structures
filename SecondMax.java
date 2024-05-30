
import java.util.ArrayList;
import java.util.List;

public class SecondMax {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(2);
        int max = 1;
        int secMax = 1;
        for (int item : arr) {
            if (max < item) {
                secMax = max;
                max = item;
            }
        }
        System.out.println("second max: "+secMax);
    }
}
