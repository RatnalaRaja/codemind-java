import java.util.*;
class prime{
    public static boolean isPrime(int n){
        if (n<2)
        return false;
        for(int i=2;i<Math.sqrt(n)+2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if (isPrime(n)){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}