import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(),b=sc.nextInt();
        int c=0;
        int []arra=new int [size];
        for(int i=0;i<size;i++){
            arra[i]=sc.nextInt();
            if (arra[i]%b==0){
                c++;
            }
        }
        System.out.print(c);
    }
}