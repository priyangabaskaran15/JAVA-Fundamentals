import java.util.ArrayList;
import java.util.Scanner;
public class middle_val_after_rem_neg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();

            if(num>=0){
                list.add(num);
            }
        }
        if(list.size() ==0){
            System.out.println("");
        }
        else{
            int res = list.size()/2;
            System.out.println(list.get(res));
        }
        
        

    }
}
