import java.util.*;
class Solo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n;
        int c=0;
        n=sc.nextLong();
        while(n!=0){
            n/=10;
            c++;
        }
        if(c==10){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}