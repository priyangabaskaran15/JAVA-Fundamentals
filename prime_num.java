public class prime_num {
    public static void main(String[]args){
        int num = 11;
        boolean prime = true;
        for(int i=2;i<num;i++) // Also,  for(int i=2; i<=num/2 ;i++)
            {
            if(num%i==0){
                    prime = false;
                    break;
            }
        }
        if(prime){
            System.out.println("Prime Num");
        }
        else{
            System.out.println("Not Prime Num");
        }
    }
}


