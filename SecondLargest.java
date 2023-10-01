import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int secondLargest = secondLargest(new int[]{10, 12, 13, 2, -2, 3, 6, 7, 8, 9, 0});
        System.out.println(secondLargest);
    }

    private static  int secondLargest(int[] input){
        int largest = -1;
        int index = -1;
        int secondLargest = -1;
        for(int i = 0; i < input.length; i++){
            if(input[i] > largest){
                largest = input[i];
                index = i;
            }
        }
        for(int i = 0; i < input.length; i++){
            if(i != index && input[i] != largest){
                if(input[i] > secondLargest){
                    secondLargest = input[i];
                }
            }
        }
        return secondLargest;
    }
}
