import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char k=sc.next().charAt(0);
        if(k=='a'||k=='A'||k=='e'||k=='E'||k=='i'||k=='I'||k=='o'||k=='O'||k=='u'||k=='U'){
        
        System.out.print("Vowel");
    }
        else{
        System.out.print("Consonant");    
        }
    }
}
