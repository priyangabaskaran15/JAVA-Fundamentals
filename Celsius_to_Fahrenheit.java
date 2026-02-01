import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[]args){
        // Formula : Celsius to Fahrenheit -> F=(9/5​×C)+32
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
        int C = sc.nextInt();
        
        int res = ((9/5)*C)+32;
        System.out.println(res+" F");

    }
}
