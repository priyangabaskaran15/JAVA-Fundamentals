// Find the largest of two numbers.
// Find the largest of three numbers.

public class largest_of_nums {
    public static void main(String[]args){
        int a = 10;
        int b= 20;
        System.out.println("Two numbers: "+a+","+b);
        
        // largest of 2 num : 
        if(a>b){
            System.out.println("Largest num is: " + a);
        }
        else{
            System.out.println("Largest num is: " + b);
        }

         // largest of 3 num : 
         int x = 1, y = 2, z = 3;
         System.out.println("Three numbers: "+x+","+y+","+z);

        if(x>y &&x>z){
            System.out.println("Largest num is: " + x);
        }
        else if(y>z){
            System.out.println("Largest num is: " + y);
        }
        else{
            System.out.println("Largest num is: " + z);
        }
    }
}
