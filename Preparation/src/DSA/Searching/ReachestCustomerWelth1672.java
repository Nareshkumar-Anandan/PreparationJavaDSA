package DSA.Searching;

public class ReachestCustomerWelth1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
                {1,2,3,4},
        };
        int ans=MaxWealth(accounts);
        System.out.println(ans);
    }
    static int MaxWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length ; row++) {
            int sum=0;
            for (int col = 0; col < accounts[row].length; col++) {
               sum+=accounts[row][col];
            }
            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}
