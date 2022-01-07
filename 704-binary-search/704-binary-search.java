class Solution {
    public int search(int[] nums, int target) {

       int i =0;
        int j = nums.length-1;
        int ans = binary(i,j,nums,target);
        
        return ans;
        
    }
    
    public static int binary(int low , int high , int [] arr, int target){
        if(low>high){
            return -1;
        }
    int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binary(low , mid-1 , arr, target);
        }
        else{
             return binary(mid+1 , high , arr, target);
        }
    }
    
}