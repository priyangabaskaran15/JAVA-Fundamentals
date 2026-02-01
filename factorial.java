public class factorial{
    public static void main(String[]args){
        // Starting from 1  : 1*2*3*4*5
        int num = 1;
        int fact = 1;
        while(num<=5){
            fact = fact*num;
            num++;
        }
        System.out.println(fact);

        int number = 5; // Starting from 5  : 5*4*3*2*1
        int fac = 1;
        while(number>0){
            fac*=number;
            number--;
        }
        System.out.println(fact);
    }
}
