public class strong_num {
    public static void main(String[]args){
        int num = 145;
        int org=num;
         int add=0;
        while(num>0){
            int fact = 1;
            int mod = num%10;
            for(int i=1;i<=mod;i++){
                    fact = fact*i;      
            }
            num /=10;
            add+=fact;     
        }
        if(add==org){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }     
       
    }
    
}
