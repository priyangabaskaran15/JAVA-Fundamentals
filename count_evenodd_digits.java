public class count_evenodd_digits {
    public static void main(String[]args){
        int n = 1234;
        int evencount=0,oddeven=0;
        int rev = 0;
        while(n>0){
            int mod = n%10;
            rev = rev*10+mod;
            n = n/10;
            if(rev%2==0){
                evencount++ ;
            }
            else{
                oddeven++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddeven);
    }
}

