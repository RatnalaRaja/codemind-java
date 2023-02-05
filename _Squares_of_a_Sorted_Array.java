import java.util.*;
class Java{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr1);
        for(int i:arr1){
            System.out.print(i+" ");
        }
        
    }
}