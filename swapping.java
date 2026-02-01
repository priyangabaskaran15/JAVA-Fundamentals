//  Swap two numbers (with and without third variable)
public class swapping {
    public static void main(String[]args){
        int a = 10,b=20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: " + a + " " + b); // using temp

        int x = 11, y = 12;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swapping: " + x + " " + y); // without using temp

    }
}
