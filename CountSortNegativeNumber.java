import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountSortNegativeNumber {
    public static void main(String[] args) {
        int[] array ={-2,3,8,3,-2,3};
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
        Collections.sort(input);
        Integer maxEle = input.get(input.size() -1);
        Integer minEle = input.get(0);
        int[] frequency = new int[maxEle - minEle + 1]; //0-9
        System.out.println(frequency);
        for(Integer ele : input){
            if(frequency[ele - minEle] == 0){
                frequency[ele - minEle] = 1;
            } else if (frequency[ele - minEle] > 0) {
                frequency[ele - minEle] = frequency[ele - minEle] + 1;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("frequency"+ Arrays.toString(frequency));
        for(int i = 0; i < maxEle - minEle + 1; i++){
            if(frequency[i] != 0){
                for(int j = 0; j < frequency[i]; j++){
                    result.add(i + minEle);
                }
            }
        }
        return result;
    }
}
