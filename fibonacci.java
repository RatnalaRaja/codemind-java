import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),temp=0,a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(temp+" ");
            a=b;
            b=temp;
            temp=a+b;
        }
        //return 0;
    }
}