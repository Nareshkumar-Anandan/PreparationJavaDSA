package DSA.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        //Seaching a Element in an Array through linearly known as LinearSearch

//        int arr[] = {2, 3, 4, 56, 67, 9};
//        int target = 56;
//        System.out.println(linearSearch(arr, target));
        //Using String

        String name="Nareshkumar";
        char target='u';
        linearSearch(name,target,2,8);
    }
//    static int linearSearch(int[] arr, int target) {
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }
    static boolean linearSearch(String name,char target,int start,int end){
        if(name.length()==0){
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(name.charAt(i)==target){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}
