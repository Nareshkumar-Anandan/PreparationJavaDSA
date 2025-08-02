package DSA.Searching;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        //We can also search in 2D arrays

        int[][] arr={
                {1,2,3,4},
                {5,6,56,8},
                {9,10,11,12},
        };
        int target=56;
        boolean ans=linearSearch(arr , target);
        System.out.println(ans);

    }
    static boolean linearSearch(int[][] arr , int target){
        if(arr.length==0){
            return false;
        }
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target) {
                    return true;
                }
            }

        }
        return false;
    }
}
