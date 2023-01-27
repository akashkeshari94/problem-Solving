import java.util.Scanner;

public class SwitchStatemnet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //String fruit=in.next();

       /* switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Keeps the doctor away");
            case "Banana" -> System.out.println("Take before hitting the gym");
            case "Pomegranate" -> System.out.println("lots of efforts in peeling it off");
            default -> System.out.println("Enter a valid fruit");
        }*/

        int day=in.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Each case will keep executing until a break statement is there
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday");
            break;
            case 6:
            case 7:System.out.println("Weekend");
            break;
        }

        //Better way to write above code
        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
