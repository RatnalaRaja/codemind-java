import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double f=sc.nextFloat();
        double c=((f-32)*5)/9;
        System.out.format("%.2f",c);
    }
}