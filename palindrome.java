public class palindrome {
    public static void main(String []args){
        int num = 101;
        int org = num;
        int rev = 0;
        while(num>0){
            int mod = num%10;
            rev = rev*10+mod;
            num = num/10;
        }
        if(rev == org){
            System.out.println(org + " is Palindrome");
        }
        else{
            System.out.println(org + " is Not Palindrome");
        }

    }
}
