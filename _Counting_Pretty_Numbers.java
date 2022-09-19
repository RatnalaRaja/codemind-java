import java.util.*;
class preety{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt(),r=sc.nextInt();
            int c=0;
            for(int j=l;j<=r;j++){
                if(j%10==2 || j%10==3||j%10==9)
            
                c+=1;
            }
            
        System.out.println(c);
        }
    }
}