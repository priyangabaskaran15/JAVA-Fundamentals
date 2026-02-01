public class armstrong {
    public static void main(String[]args){
        int num = 153;
        int org=num;
        int cube,add=0;
        while(num>0){
            int mod = num%10;
            num/=10;
            // Armstrong Logic
             cube = mod*mod*mod;
             add+=cube;
        }
        if(add==org){
                System.out.println("Armstrong Number");
        }
        else{
                System.out.println("Not Armstrong Number");
        }
    }
}
