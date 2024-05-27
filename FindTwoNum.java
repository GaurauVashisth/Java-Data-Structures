
import java.util.ArrayList;

class FindTwoNum {
   public static ArrayList<Integer> findNum(ArrayList<Integer> arr,int val, int size){
    for (int a : arr) {
        for(int b:arr){
            if(a+b == val){
                ArrayList<Integer> twoVals = new ArrayList<>();
                twoVals.add(a);
                twoVals.add(b);
                return twoVals;
            }
        }
    }
    ArrayList<Integer> values = new ArrayList<>();
    return values;
    }
    
}

