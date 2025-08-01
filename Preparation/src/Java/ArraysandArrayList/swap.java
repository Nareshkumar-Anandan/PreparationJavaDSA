package Java.ArraysandArrayList;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[4];
        arr[4]=temp;
    }

}
