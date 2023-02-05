import java.util.*;
class Store{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
                i=i+1;
        }
        }
        System.out.println(c);
    }
}