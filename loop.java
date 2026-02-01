import java.util.*;
public class loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Print 1 to N | Input: 5 | Output: 1 2 3 4 5
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        // Print N to 1 | Input: 5 | Output: 5 4 3 2 1
        for(int i= n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}

