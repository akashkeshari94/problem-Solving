import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int result=0;

        while(true){
            char operation=sc.next().trim().charAt(0);
            if(operation=='+' || operation=='-'|| operation=='*'|| operation=='/'){
                int input1=sc.nextInt();
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
        }
    }
}
