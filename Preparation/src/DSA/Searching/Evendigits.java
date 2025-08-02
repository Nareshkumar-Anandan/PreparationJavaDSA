package DSA.Searching;

public class Evendigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int count=evenDigits(nums);
        System.out.println(count);
    }
    static int evenDigits(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int count=0;
        for(int num:nums){
            if(evenNum(num)){
                count++;
            }
        }
        return count;
    }
    static boolean evenNum(int nums){
        if(digits(nums)%2==0){
            return true;
        }
        return false;
    }
    static int digits(int nums){
        int count=0;
        while(nums!=0){
            nums=nums/10;
            count++;
        }
        return count;
    }

}
