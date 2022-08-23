import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        double S=(a+b+c)/2;
        double area =Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.format("%.2f",area);
    }
}