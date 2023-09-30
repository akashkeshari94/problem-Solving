import java.util.Arrays;

public class SwapArrayElementFromLToR {
    public static void main(String[] args) {
        int []swapped = swapArray(new int[]{10, 12, 13, 2, -2, 3, 6, 7, 8, 9, 0}, 2, 5);
        System.out.println(Arrays.toString(swapped));
    }

    private static int[] swapArray(int[] input, int L, int R){
        int i = L;
        int j = R;
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
