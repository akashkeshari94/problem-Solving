import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array ={6,3,4,2,7,2,1};
        ArrayList<Integer> input = new ArrayList<>();
        for (int i : array)
        {
            input.add(i);
        }
        ArrayList<Integer> result = sortTheArray(input);

        System.out.println(result);
    }

    private static ArrayList<Integer> sortTheArray(ArrayList<Integer> input) {
        ArrayList<Integer> frequency = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            frequency.add(0);
        }
        for(Integer ele : input){
            frequency.set(ele, frequency.get(ele) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>(10);
        for(int i = 0; i < input.size(); i++){
            result.add(0);
        }
        int index = 0;

        for(int i = 0; i < 10; i++){
            int freq = frequency.get(i);
            for(int j = 0; j < freq; j++){
                result.set(index, i);
                index++;
            }

        }
        System.out.println(frequency);
        return result;


    }
}
