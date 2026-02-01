// Sum of N numbers | Input: 5 | Output: 15

public class sum_of_natural_num {
    public static void main(String[]args){
        int sum = 0;
        int n = 5;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of N numbers: "+sum);
    }
}
