// Reverse number | Input: 123 | Output: 321
public class reverse_prgm {
    public static void main(String[]args){
        int n = 123456;
        int rev = 0;
        while (n>0) {
            int mod = n%10;
            rev = rev*10+mod;
            n = n/10;
        }
        System.out.println("Reversed value: "+rev);

    }
}
