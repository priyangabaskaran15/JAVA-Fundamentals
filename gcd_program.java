public class gcd_program {
    public static void main(String[]args){
        int a = 48;
        int b = 18;
        while(b>0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        System.out.print("GCD: "+a);
    }
}
/*  GCD : Input: 12 18 | Output: 6
> 12 factors = 1,12,2,6,4,3
> 18 factors = 1,18,6,3,9,2 
Common highest value is 6 -- Method 1
*/