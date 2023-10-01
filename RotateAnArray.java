import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {
        int [] rotated = rotateKTimes(new int[]{10, 12, 13, 2, -2, 3, 6, 7, 8, 9, 0} , 5);
        System.out.println(Arrays.toString(rotated));
    }

    private static int[] rotateKTimes(int[] input, int K){
        K= K%input.length;
        reverseTheArray(input, 0, input.length-1);
        //reverseTheArray(Arrays.copyOfRange(input,0,K-1),0,K-1);
        reverseTheArray(input,0,K-1);
        reverseTheArray(input,K,input.length-1);
        //reverseTheArray(Arrays.copyOfRange(input,K+1,input.length-1),K,input.length-1);
        return input;
    }
    private static int[] reverseTheArray(int[] array, int L, int R){
        int i = L;
        int j = R;
        while (i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return array;

    }
}
