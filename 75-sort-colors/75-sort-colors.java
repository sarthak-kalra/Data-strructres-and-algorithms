class Solution {
    public void sortColors(int[] nums) {
        
        int si = 0;
        int ei = nums.length-1;
        
        quicksort(si,ei,nums);
        
        
    }
    
    public void quicksort(int si , int ei , int [] nums){
        if(si>ei){
            return;
        }
        int pos =  partition(si,ei,nums);
        quicksort(si,pos-1,nums);
        quicksort(pos+1,ei,nums);
        
        return;
    }
    
    public int partition(int si, int ei , int[] nums){
        int count = 0;
        int pivot = nums[si];
        for(int i = si+1;i<=ei;i++){
           if(pivot>nums[i]){
            count++;
           }
        }
            int temp = nums[si+count];
            nums[si+count]= pivot;
            nums[si]=temp;
            
            int pivotpos =si+count;
            int j = si;
            int k = ei;
            while(j<pivotpos&&k>pivotpos){
                if(nums[j]>=pivot&&nums[k]<pivot){
                    int swap = nums[j];
                    nums[j]=nums[k];
                    nums[k]=swap;
                    j++;
                    k--;
                }  else if(nums[j]<pivot){
                    j++;
                }else if(nums[k]>=pivot){
                    k--;
                }
            }
             
         return pivotpos;
    }
    
    
}