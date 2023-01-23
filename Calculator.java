import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int result=0;

        while(true){
            System.out.println("Enter a operator: ");
            char operation=sc.next().trim().charAt(0);
            System.out.println();
            if(operation=='+' || operation=='-'|| operation=='*'|| operation=='/'){
                System.out.println("Enter the 1st Number: ");
                int input1=sc.nextInt();
                System.out.println("Enter the 2nd Number: ");
                int input2=sc.nextInt();

                if(operation=='+'){
                    result=input1+input2;
                }
                if(operation=='-'){
                    result=input1-input2;
                }
                if(operation=='*'){
                    result=input1*input2;
                }
                if(operation=='/'){
                    result=input1/input2;
                }

            }else if(operation=='x' || operation=='X'){
                break;
            }else {
                System.out.println("Not a Valid operation");
            }
            System.out.println("The result is "+result);
        }

    }
}
