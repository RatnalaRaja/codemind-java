import java.util.*;
class main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for (int i=1;i<n+1;i++){
             k=i*(i+1)/2;
        }
        System.out.print(k);
    }
}