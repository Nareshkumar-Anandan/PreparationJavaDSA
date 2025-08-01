package Java.Functions;

public class methodOverloading {
    public static void main(String[] args) {
        fun();
        fun(20,20);
        fun("Nareshkumar Anandan");
        fun(230,1,2,3,4,5);
    }
    public static void fun(int a,int b){
        System.out.println(a+b);
    }
    public static void fun(){
        System.out.println("Greeting from fun");
    }
    public static void fun(String Name){
        System.out.println(Name);
    }
    public static void fun(int a,int ...v){

        System.out.println(v[0]+v[1]+v[2]+v[3]+v[4]);
    }
}
