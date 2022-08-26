import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<t+1;i++){
            double x1=sc.nextFloat();
            double x2=sc.nextFloat();
            double y1=sc.nextFloat();
            double y2=sc.nextFloat();
            double a=y1/x1;
            double b=y2/x2;
            if (a<b){
                System.out.println("-1");
            }
            else if(b<a){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
    }
}
}