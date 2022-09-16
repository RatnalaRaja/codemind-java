import java.util.*;
class tab{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt();
        for(int i=1;i<=r;i+=2){
            System.out.format("%d x %d = %d
",n,i,n*i);
        }
        
    }
}