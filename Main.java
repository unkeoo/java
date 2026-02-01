
import java.util.Scanner;
 public class Main{
    public static void main(String [] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        String str;
        System.out.println("enter character");
        str = kb.next();
        char ch;
        ch=str.charAt(0);
        System.out.println("Character is "+ch);

        System.out.println("Enter a char");
        char chr;
        chr=(char) System.in.read();
        System.out.println("Character is " +chr);

        
    }
}
