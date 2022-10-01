import java.util.*;
class solo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0,product=1;
        while (x>0){
        sum+=x%10;
        product*=x%10;
        x=x/10;
    }
    if (sum==product){
        System.out.println("Spy Number");
    }
    else{
        System.out.println("Not Spy Number");
    }
}
}