import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int k=n*n;
        while(k>0){
            sum+=k%10;
            k=k/10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
    }
    }
}