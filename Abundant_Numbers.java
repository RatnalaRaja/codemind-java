import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(),k=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                k+=i;
            }
        }
                //System.out.print(k);
        if(k>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}