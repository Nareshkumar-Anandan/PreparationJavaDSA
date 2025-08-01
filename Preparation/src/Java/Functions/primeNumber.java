package Java.Functions;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        printPrime(n);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if (c*c>n) {
            return true;
        }
        return false;
    }
    public static void printPrime(int n){
        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        }
    }

