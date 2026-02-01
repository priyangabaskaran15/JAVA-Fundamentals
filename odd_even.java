// Check whether a number is even or odd.

import java.util.Scanner;

public class odd_even {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even Num");
        }
        else{
            System.out.println("Odd Num");
        }
    }
    
}
