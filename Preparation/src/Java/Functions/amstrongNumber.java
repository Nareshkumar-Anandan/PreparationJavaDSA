package Java.Functions;
import java.util.Scanner;
public class amstrongNumber {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in) ;
        int n =sc.nextInt() ;
        boolean ans=amstrongNumber(n);
        System.out.println(ans);
        for(int i=100;i<=1000;i++){
            if(amstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean amstrongNumber(int n){
        int sum=0;
        int amstrong=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
       return sum==amstrong;

    }
}
