package Java.ArraysandArrayList;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // Array is a collection of the same datatypes with continious memory allocation
        //Syntax
        //datatypes variable_name=Object Creation[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
        changeArr(arr);
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void changeArr(int[] arr){
        arr[1]=25;
    }
}
