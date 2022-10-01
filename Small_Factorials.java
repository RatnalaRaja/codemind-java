import java.util.*;
class solo{

    public static int findFact(int n){
        int fact=1;
        for(int i=1;i<n+1;i++){
            fact=fact*i;

        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,res,t;
        t=sc.nextInt();
        for(int j=1;j<=t;j++){
        n=sc.nextInt();
        res=findFact(n);
        System.out.println(res);
    }
}
}
    