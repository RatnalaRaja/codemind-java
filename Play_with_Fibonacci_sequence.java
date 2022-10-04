import java.util.*;
class fib{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(sum+" ");
            a=b;
            b=sum;
            sum=a+b;
            
        }
        
    }
}