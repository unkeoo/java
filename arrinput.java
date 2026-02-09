package arrayexamples;

import java.util.Scanner;

public class arrinput {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter no:");
            arr[i]=kb.nextInt();
        }
        System.out.println("You inputted");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    
}
