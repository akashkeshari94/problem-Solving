import java.util.ArrayList;
public class SpecialIndexArray {
    public static void main(String[] args) {
        int [] ints = {2, 1, 6, 4};
        ArrayList<Integer> input = new ArrayList<>();
        for (int i : ints) {
            input.add(i);
        }
        int count = specialIndexCount(input);
        System.out.println(count);
    }

    private static int specialIndexCount(ArrayList<Integer> A){
         int count = 0;
         for(int i = 0; i < A.size(); i++){
             int evenIndexedSum = 0;
             int oddIndexedSum = 0;
             int temp = A.remove(i);
             for(int j = 0; j < A.size(); i++){
                 if(j % 2 == 0){
                     evenIndexedSum += A.get(j);
                 }else{
                     oddIndexedSum += A.get(j);
                 }
             }
             if(evenIndexedSum == oddIndexedSum){
                 count++;
             }
             A.add(i,temp);
         }
         return count;
    }

}
