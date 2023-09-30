import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int []swapped = swapArray(new int[]{10, 12, 13, 2, -2, 3, 6, 7, 8, 9, 0});
        System.out.println(Arrays.toString(swapped));
    }

    private static int[] swapArray(int[] input){
        int i = 0;
        int j = input.length-1;
        while (i < j){
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }

        return input;
    }
}
