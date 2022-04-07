class Solution {
    public void sortColors(int[] arr) {
        for(int itr = 1;itr<arr.length;itr++){
            for(int i = 0;i<arr.length-itr;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}