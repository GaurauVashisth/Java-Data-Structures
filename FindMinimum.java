import java.util.ArrayList;
import java.util.List;

class FindMinimum{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(0);
        arr.add(9);
        int minNumber = arr.get(0);
        for(int item : arr){
            if(minNumber>item)
                minNumber = item;
        }
        System.out.println("Minimum number is: "+minNumber);
    }
}