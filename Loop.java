import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {

       /*  int i;
        i=10;//initialization
        while (i>=1){
            System.out.println(i);
            i--;
        }*/

        Scanner kb = new Scanner(System.in);
        int n;
        System.out.println("Enter an int");
        n = kb.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;

        }
        System.out.println("Sum is "+sum);
    }
}
