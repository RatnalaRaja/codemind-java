import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                flag=0;
                System.out.print("no");
                break;
            }
            else{
                flag=1;
            }
        }
        if (flag==1){
            System.out.print("yes");
        }
    }
}