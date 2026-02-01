public class lcm_program {
    public static void main(String[]args){

        // LCM(a, b) = (a × b) / GCD(a, b) --> using LCM 

        // GCD Logic 
        int x = 4,y = 6;
        int aa = x, bb = y, lcm;
        while(y>0){
            int temp = y;
            y = x%y;
            x = temp;
        }
       // LCM a × b) / GCD(a, b)
       lcm = aa*bb / x;
       System.out.println(lcm);
// -----------------------------------------------------------------------------------
       // Without using GCD 
        int a = 4;
        int b = 6;
        int max = Math.max(a, b); // without using inbuilt use if else to check large num
        while(max%a!=0 || max%b!=0){ 
             max++;
        }
       System.out.println(max);


    

    }
}
