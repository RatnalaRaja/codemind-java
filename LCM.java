import java.util.*;
class Lcm{
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
        
    }
    public static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();m=sc.nextInt();
        lcm(n,m); 
        System.out.println(lcm(n,m));
        
    }
}