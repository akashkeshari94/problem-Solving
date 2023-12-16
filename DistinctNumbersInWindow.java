import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int[] array ={1,2,1,3,4,3};
        ArrayList<Integer> input = new ArrayList<>();
        for (int i : array)
        {
            input.add(i);
        }
        ArrayList<Integer> result = distinctNumbersInWindow(input, 3);

        System.out.println(result);
    }

    private static ArrayList<Integer> distinctNumbersInWindow(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //add the elements for the very first window
        for(int i = 0; i < B; i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i), map.get(i) + 1);
            }else{
                map.put(A.get(i), 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(map.size());

        for(int i = 1; i <= A.size() - B; i++){
            int startIndex = i;
            int endIndex = i + B - 1;
            if(map.containsKey(A.get(startIndex - 1))){
                if(map.get(A.get(startIndex - 1)) == 1){
                    map.remove(startIndex - 1);
                }else{
                    map.put(A.get(startIndex - 1), map.get(A.get(startIndex - 1)) - 1);

                }
            }
            // map.remove(startIndex - 1);
            if(map.containsKey(A.get(endIndex))){
                map.put(A.get(endIndex), map.get(A.get(endIndex) + 1));
            }else{
                map.put(A.get(endIndex), 1);
            }
            result.add(map.size());
            Stack<Integer> s = new Stack<>();
        }
        return result;
    }
}
