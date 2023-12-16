import java.util.ArrayList;
import java.util.Arrays;

public class FormSmallestNumber {
    public static void main(String[] args) {
        int[] array ={6,3,4,2,7,2,1};
        ArrayList<Integer> input = new ArrayList<>();
        for (int i : array)
        {
            input.add(i);
        }
        ArrayList<Integer> result = formSmallestNumber(input);

        System.out.println(result);
    }

    private static ArrayList<Integer> formSmallestNumber(ArrayList<Integer> input) {
        //create an array which stores the frequency at each index as value from the input element
        int[] frequency = new int[10]; //0-9
        System.out.println(frequency);
        for(Integer ele : input){
            if(frequency[ele] == 0){
                frequency[ele] = 1;
            } else if (frequency[ele] > 0) {
                frequency[ele] = frequency[ele] + 1;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("frequency"+ Arrays.toString(frequency));
        for(int i = 0; i < 10; i++){
            if(frequency[i] != 0){
                for(int j = 0; j < frequency[i]; j++){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
