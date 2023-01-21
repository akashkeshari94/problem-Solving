import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=in.nextInt();
        int newNum=0;
        while (num>0){
            int rem=num%10;
            newNum=newNum*10+rem;
            num=num/10;
        }
        System.out.println("Reversed number is "+newNum);
    }
}
