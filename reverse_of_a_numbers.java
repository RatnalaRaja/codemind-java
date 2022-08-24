import java.util.*;
class main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int temp=n;
        while(n!=0){
            int remai=n%10;
            reverse=reverse*10+remai;
            n=n/10;
        
        }
            System.out.print(reverse);
    }
}