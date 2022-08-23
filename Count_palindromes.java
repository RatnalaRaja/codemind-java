import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        //int arr[] =new int [size];
        int count=0;
        for (int i=0;i<size;i++){
            int j=sc.nextInt(),reverse=0;
            int temp=j;
            while(j!=0){
                int remai=j%10;
                reverse=reverse*10+remai;
                j=j/10;
            }
            if (temp==reverse){
                count++;
            }
        }
            System.out.print(count);
    }
}