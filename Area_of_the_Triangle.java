import java.util.*;
class main{
    public static void main(String args[]){
        Scanner t =new Scanner(System.in);
        double a=t.nextFloat(),b=t.nextFloat(),c=t.nextFloat();
        double s=(a+b+c)/2;
        //System.out.print(s);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}    