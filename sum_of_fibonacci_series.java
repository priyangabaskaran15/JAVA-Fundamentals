// Sum of fibonacci series 
public class sum_of_fibonacci_series {
    public static void main(String[]args){
        int N= 5;
        int first = 0 , second = 1;
        int sum=first+second;
         System.out.print(first+" "+second);
        for(int i=2;i<N;i++){
                int next = first+second;
                first = second;
                second = next;
                System.out.print(" "+next+" ");
                sum=sum+second;

        }
        System.out.println("Sum: "+sum);
    }
}
