import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int hurlf=sc.nextInt(),spinf=sc.nextInt(),speedf=sc.nextInt();
        if(hurlf>50 & speedf>100 && spinf>60){
        System.out.print("10");
    }
    else if(hurlf>50 && spinf>60){
         System.out.print("9");
    }
    else if(speedf>100 && spinf>60){
         System.out.print("8");
    }
    else if(hurlf>50 && speedf>100){
         System.out.print("7");
    }
    else if (hurlf>50 || speedf>100 || spinf>60){
         System.out.print("6");
    }
    else{
         System.out.print("5");
    }
    
    
}
    }
