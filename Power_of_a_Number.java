import java.util.*;
class solooo{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double k=Math.pow(a,b);
        int f=(int)k;
        System.out.println(f%c);
    }
}