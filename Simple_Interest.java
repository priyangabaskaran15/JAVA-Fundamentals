import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[]args){
    // SI= P * R * T​ / 100
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Principle: ");
    int p = sc.nextInt();
    System.out.println("Enter rate of interest: ");
    int r = sc.nextInt();
    System.out.println("Enter Time in years: ");
    int t = sc.nextInt();

    // SI formula 
    int SI = (p*r*t) / 100 ;
    System.out.println("Simple Interes: "+SI);   
    }

}
