import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* String fruit=sc.next();

        switch (fruit){
            case "Mango"-> System.out.println("King of fruits");
            case "Banana" -> System.out.println("Eat before hitting the gym");
            case "Orange"-> System.out.println("Vitamin c");
            case "Apple" -> System.out.println("Keeps a doctor away");
            case "pomegranate" -> System.out.println("take time to peel off");
            default -> System.out.println("Entera valid fruit");
        }*/

        int day=sc.nextInt();

        /*switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tue");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thur");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");
        }*/

        /*switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday");
            break;
            case 6:
            case 7: System.out.println("Weekend");
            break;

        }*/

        switch (day){
            case 1 ,2, 3, 4, 5 ->System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
