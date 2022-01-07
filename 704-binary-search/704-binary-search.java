class Solution {
    public int search(int[] nums, int target) {
        int ans = binary(0,nums.length-1,target,nums);
        return ans;
    }
    
    public int binary(int left,int right,int target,int[] nums){
        if(right<left){
            return -1;
        }
        int mid = (left+right)/2;
        if(target == nums[mid]){
            return mid;
        }
        else if(nums[mid]>target){
            return binary(left,mid-1,target,nums);
        }
        else{
            return binary(mid+1,right,target,nums);
        }
    }
}