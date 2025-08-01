package Java.Functions;

public class Scope {
    //Global Scope
   static int X = 10;
    public static void main(String[] args) {
        System.out.println(X);
        int X=20;
        System.out.println(X);

        //black Scope
        {
             X=30;
             System.out.println(X);
        }
        System.out.println("From the functional scope");
        functionScope();
        for(int i=0;i<=X;i++){
            System.out.print(i + ",");
        }

    }
    //function Scope
    public static void functionScope(){
        int a =10;
        int b=20;
        System.out.println(a+b+X);
    }

    }
