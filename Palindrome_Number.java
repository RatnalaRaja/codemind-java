import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<t+1;i++){
            int n=sc.nextInt();
            int reverse=0;
            int temp=n;
            while (n!=0){
                int remainder=n%10;
                reverse=reverse*10+remainder;
                n=n/10;
            }
                if (temp==reverse){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
        }
    }
}