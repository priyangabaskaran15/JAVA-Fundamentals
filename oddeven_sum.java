// Sum of even numbers | Input: 10 | Output: 30
// Sum of odd numbers | Input: 10 | Output: 25
public class oddeven_sum {
    public static void main(String[]args){
        int n = 10;
        int oddsum = 0;
        int evensum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum += i;
            }
            else{
                oddsum += i;
            }
        }
        System.out.println("Even sum: "+evensum);
        System.out.println("Odd sum: "+oddsum);
    }
}
