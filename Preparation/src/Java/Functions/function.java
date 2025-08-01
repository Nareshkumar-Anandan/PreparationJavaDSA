package Java.Functions;

public class function {
    public static void main(String[] args){
        fun();
        fun2(1234);
        System.out.println(value(1,2,3,4,5,6));
    }
    public static void fun(){
        System.out.println("From the fun function");
    }
    public static void fun2(int fun2){
        System.out.println(fun2);
    }
    public static int value(int ...v){
        return v[5];
    }
}
