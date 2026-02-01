//  Multiplication table | Input: 3 | Output: 3 6 9 12 15
import java.util.*;
public class multiplication_table{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();
        int mul=1;
        for(int i=1;i<=10;i++){
            mul = n*i;
            System.out.print(mul+" ");
        }
        
    }
}