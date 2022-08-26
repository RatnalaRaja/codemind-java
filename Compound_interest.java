import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextFloat(),r=sc.nextFloat(),t=sc.nextFloat();
        double CI = p *(Math.pow((1 + r / 100), t));
          
        //double CI = amount - p;
        System.out.format("%.2f",CI);
    }
}