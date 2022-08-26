import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String james=sc.nextLine();
        String name=sc.nextLine();
        double unit =sc.nextInt();
        double k=unit*2.00;
        double k1=k+((15*k)/100);
        double b=(unit*1.80);
        double b1=b+((15*b)/100);
        double a=(unit*1.20);
        double a1=a+((15*a)/100);
        if (unit<200){
            System.out.format("%.2f",(a)+100);
        }
        else if(unit>=200 && unit<400){
            System.out.format("%.2f",(unit*1.50)+100);
        }
        else if (unit>=400 && unit<600 ){
            if(b>400){
                System.out.format("%.2f",b1);
            }
            else{
                System.out.format("%.2f",b+100);
            }
        }
        else if(unit>=600&& unit<700){
            System.out.format("%.2f",k+100);
        }
        else if (unit>=700){
            System.out.format("%.2f",k1);
        }
    }
}