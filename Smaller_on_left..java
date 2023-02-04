import java.util.*;
class Smaller{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=i;j>=0;j--){
                if(arr[i]>arr[j]){
                    System.out.print(arr[j]+" ");
                    flag=1;
                    break;
                    
                }
                
            }
            if(flag==0){
                    System.out.print(-1+" ");
                }
        }
        
    }
}