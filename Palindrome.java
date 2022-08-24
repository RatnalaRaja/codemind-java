import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        while(n!=0){
            int rema=n%10;
            reverse=reverse*10+rema;
            n=n/10;
            }
            if (temp==reverse){
                System.out.println("True");
            }
            else{
                System.out.print("False");
            }
    }
}