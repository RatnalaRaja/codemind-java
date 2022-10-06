import java.util.*;
class fence{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int l=sc.nextInt(),b=sc.nextInt(),d=sc.nextInt(),c=sc.nextInt(),nl,nb,area;
        nl=l+d+d;
        nb=b+d+d;
        area = nl*nb - l*b;
        System.out.println(area*c);
        
        
        
    }
}