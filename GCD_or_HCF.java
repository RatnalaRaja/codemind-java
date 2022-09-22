import java.util.*;
class GFG {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
 
        return gcd(b % a, a);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(gcd(n,m));
    }
}