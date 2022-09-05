import java.util.*;


class main{
    public static boolean prime(int n){
     if (n==0 || n==1){
         return false;
     }   
     for(int i=2;i<Math.sqrt(n)+1;i++){
         if (n%i==0){
             return false;
         }
     }
     return true;
    }
    
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),c=0;
        for(int i=n;i<m+2;i++){
            if(prime(i)){
                c++;
            }
            
        }
                System.out.println(c);
}
    }