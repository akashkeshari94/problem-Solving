import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CheckPair {
    public static void main(String[] args) {
        int[] array ={2,1,2,1,2,1,2,1,2};
        ArrayList<Integer> input = new ArrayList<>();
        for (int i : array)
        {
            input.add(i);
        }
        //boolean result = checkPair(input, 25);
       // int count = countPair(input, 12);
        int diffPair = countDiffPair(input, 1);
        //System.out.println(result);
       // System.out.println(count);
        System.out.println(diffPair);

        List<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        for (String element : stringList) {
            int hashCode = System.identityHashCode(element);
            System.out.println("Element: " + element + ", Memory Address: " + Integer.toHexString(hashCode));
        }
    }

    private static int countDiffPair(ArrayList<Integer> input, int B) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer ele: input){
            int target = ele > B ? (ele - B) : (B + ele);
            if(map.containsKey(target)){
                count += map.get(target);
            }

            if(map.containsKey(ele)){
                map.put(ele, map.get(ele) + 1);
            }else{
                map.put(ele, 1);
            }
        }
        return count;
    }

    private static int countPair(ArrayList<Integer> input, int i) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(Integer ele : input){
            if(map.containsKey(i - ele)){
                //map.put(ele, map.get(ele) + 1);
                count += map.get(i - ele);
            }

            if(map.containsKey(ele)){
                map.put(ele, map.get(ele) + 1);
            }else{
                map.put(ele,1);
            }
        }
        return count;
    }

    private static boolean checkPair(ArrayList<Integer> input, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer ele : input){
            if(set.contains(k - ele)){
                return true;
            }else{
                set.add(ele);
            }
        }
        return false;


    }
}
