import java.util.*;
class Solo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for (int j=0;j<t;j++){
            int n,arr[],sum=0;
            n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        //
        int N=(n*(n+1))/2;
        System.out.println(N-sum);
        }
    }
}