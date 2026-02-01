public class prime_num_one_to_n{
    public static void main(String[] args) {
        int N=3;
        int count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++ ;
            }
        }
        if(count==2){
            System.out.println("P");
        }
        else{
            System.out.println("NP");
        }
       
    }   
}