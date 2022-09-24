import java.util.*;
class count{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int c=0;
        int d=0;
        int []arr=new int[n];
                //System.out.print(n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if (arr[i]%2==0){
                
                c++;
            }
            if(arr[i]%2!=0){
                d++;
                //System.out.println(i);
            }
        }
        System.out.print(c+" "+d);
    }
}