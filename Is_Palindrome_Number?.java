import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();int reverse=0;
        int temp = num;
        //System.out.print(num);
    while(num != 0)   
    {  
    int remainder = num % 10;  
    reverse = reverse * 10 + remainder;  
    num = num/10; 
        }
        //System.out.print(num);
        if (temp!=reverse){
            System.out.print('1');
        }
        else{
            System.out.print('2');
        }
}
}