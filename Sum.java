import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        //sum();
        //int ans=sum2();
        int ans=sum3(20,30);
        System.out.println(ans);
    }

    private static int sum3(int a , int b) {
        int sum=a+b;
        return sum;
    }

    private static void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of "+num1+" and "+ num2+" is "+sum);

    }

    //return a value
    private static int sum2() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;

    }
}
