class Solution {
    public void sortColors(int[] arr) {
        for(int front =0;front<arr.length;front++){
            int min = Integer.MAX_VALUE;
            int mini = 0;
            for(int j =front;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mini = j;
                }
            }
            int temp = arr[front];
            arr[front]= min;
            arr[mini]= temp;
        }
    }
}
