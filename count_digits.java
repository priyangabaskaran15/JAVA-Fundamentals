// Count digits | Input: 1234 | Output: 4

public class count_digits {
    public static void main(String[]args){
        int count = 0;
        int num = 123;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("No of digits: "+count);
    }
}


// Sum of digits | Input: 123 | Output: 6
