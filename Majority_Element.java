import java.util.*;
class java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int can=-1;
        int vo=0;
        for(int i=0;i<n;i++){
            if(vo==0){
                can=arr[i];
                vo=1;
            }
            else{
                if(arr[i]==can)
                vo++;
                else
                vo--;
            }
        }
        int co=0;
        for(int i=0;i<n;i++){
            if(arr[i]==can){
                co++;
            }
            
        }
        if(co>n/2){
                System.out.println(can);
            }
            else{
                System.out.println(-1);
            }
    }
}