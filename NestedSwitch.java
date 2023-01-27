import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int employeeId=sc.nextInt();
        String department=sc.next();
         switch (employeeId){
             case 1:
                 System.out.println("Akash Keshari");
                 break;
             case 2:
                 System.out.println("Pratiksha Keshari");
                 break;
             case 3:
                 switch (department){
                     case "IT":
                         System.out.println("IT Deptt");
                         break;
                     case "Management":
                         System.out.println("Management Deptt");
                         break;
                     default:
                         System.out.println("Enter valid Deptt");
                 }
                 break;
             default:
                 System.out.println("Enter valid Emp id");
         }

    }
}
