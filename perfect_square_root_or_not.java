import java.util.*;
class Solo{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int c=0;
       // k=Math.sqrt(n);
        for(int i=1;i<=n;i++){
            if(i*i==n){
                c=1;
                break;
            }
            else
                continue;
        }
        if(c==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}