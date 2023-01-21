import java.util.Scanner;

public class OccurrenceOfADigitInAGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int enterANumber=sc.nextInt();
        System.out.println("Enter the digit for which occurrence needs to be found");
        int findTheOccurrenceOf=sc.nextInt();
        int counter=0;
        while(enterANumber>0){
            int rem=enterANumber%10;
            if(rem==findTheOccurrenceOf){
                counter++;
            }
            enterANumber=enterANumber/10;
        }
        System.out.println("The occurrence of "+findTheOccurrenceOf+" is "+ counter);

    }
}
