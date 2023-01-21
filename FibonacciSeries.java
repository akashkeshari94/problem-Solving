import java.net.StandardSocketOptions;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int count=2;
        int a=0;
        int b=1;
        if(num==1){
            System.out.println(a);
        }
        if(num==2){
            System.out.println(b);
        }
        if(num<1){
            System.out.println("Invalid input");
        }else {
            while(count<=num){
                int temp=b;
                b=a+b;
                a=temp;
                count++;
            }
            System.out.println(b);

        }

    }
}
