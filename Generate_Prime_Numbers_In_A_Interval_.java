import java.util.*;
class primerange {
    public static boolean isprime(int n){
        if (n==0 || n==1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }

public static void main(String args[] ){
    Scanner sc=new Scanner (System.in);
     int u=sc.nextInt(),r=sc.nextInt();
   for(int i=u;i<=r;i++)
   if(isprime(i))
   System.out.println(i);
}
}