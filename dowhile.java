import java.util.Scanner;
public class dowhile{
    public static void main(String[] args) {
        int a, b;
        String choice;
        Scanner kb =  new Scanner(System.in);
        do{
            System.out.println("Enter two integers");
            a=kb.nextInt();
            b=kb.nextInt();
            System.out.println("Sum is "+(a+b));
            System.out.println("do u want to repeat(yes/no) ?");
            choice = kb.next();
        
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("thank you!");
    }
}
 