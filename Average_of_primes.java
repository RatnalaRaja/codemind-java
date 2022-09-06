import java.util.*;
class main{
    public static boolean prime(int n){
        if (n==0||n==1){
            return false;
            
        }
        for(int i=2;i<(n/2)+1;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;    
    }
    public static void main(String args[]){
        Scanner scn=new Scanner (System.in);
        int t=scn.nextInt();
        double c=0,s=0;
        int []arr=new int[t];
        
        for(int i=0;i<t;i++)
        {
            arr[i] = scn.nextInt();
        }
        
        for(int i=0;i<t;i++){
            if (prime(arr[i])){
                c++;
                s+=arr[i];
            }
        }
        System.out.format("%.2f",s/c);
    }
    
    
}