import java.util.*;
class Java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        int maxg=0,maxl=0;
        for(int i=0;i<t;i++){
            if(arr[i]==1){
                maxl++;
            }
            else{
                if(maxl>maxg){
                    maxg=maxl;
                }
                    maxl=0;
            }
        if(i==t-1 && arr[t-1]==1){
            if(maxl>maxg){
                maxg=maxl;
            }
            
        }
        }
        System.out.println(maxg);
    }
}