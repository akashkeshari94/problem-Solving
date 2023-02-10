import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        //String message=greet();
        //System.out.println(message);
        //String personalized=myGreet("Akash");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.next();
        String personalized=myGreet(name);
        System.out.println(personalized);
    }

    private static String myGreet(String name) {
        String message="Hello "+ name;
        return message;
    }

    private static String greet() {
        String greet="How are you?";
        return  greet;
    }
}
