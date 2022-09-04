import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int rem,large=0;
        while(n>0){
            rem=n%10;
            if (large<rem){
                large=rem;
                
            }
            n=n/=10;
        }
        System.out.println(large);
    }
}
