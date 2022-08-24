import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double k=0;
        for (int i=1;i<=n;i++){
            k+= 1/(i*1.0);
        }
        System.out.format("%.2f",k);
    }
}