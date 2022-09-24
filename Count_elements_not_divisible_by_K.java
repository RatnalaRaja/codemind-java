import java.util.*;
class main{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt(),k=sc.nextInt();
        int []arr=new int[a];
        int c=0;
        for(int i =0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%k!=0){
                c++;
            }
        }
        System.out.println(c);
    }
}