class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i =0;i<nums.length;i++){
            int ans = binary(nums,0,nums.length,i);
            if(ans==-1){
                return i;
            }
        }
        return nums.length;
    }
    
        public static int binary(int[] arr,int left,int right,int val){
           
           if(left>right){
               return -1;
           }
           int mid = (left+right)/2;
           
           if(arr[mid]==val){
               return mid;
           }
           else if(arr[mid]>val){
               return binary(arr,left,mid-1,val);
           }
           else{
               return binary(arr,mid+1,right,val);
           }
       }
}