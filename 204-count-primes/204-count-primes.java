class Solution {
    public int countPrimes(int n) {
      boolean [] arr = new boolean [n]; 
    for(int i =0;i<arr.length;i++){
        arr[i]=true;
    }
        int count =0;
        for(int i = 2;i<=(int) Math.sqrt(n);i++){
            if(arr[i]==true){
                for(int j = i*i;j<n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i =2;i<arr.length;i++){
            if(arr[i]==true){
                count++;
            }
        }
        return count;
    }
}