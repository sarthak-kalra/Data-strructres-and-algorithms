class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            sum = sum-nums[i];
            sum = sum + i;
            
        }
        sum = sum+nums.length;
        return sum;
    }
    
       
}