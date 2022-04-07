class Solution {
    public int firstUniqChar(String str1) {
        
       int[] arr = new int[26];
        
       for (int i = 0; i < str1.length(); i++) {
           
			arr[str1.charAt(i)-'a'] = arr[str1.charAt(i)-'a'] + 1;
			
		}
        
        int ans = 0;
        for(int i =0;i<str1.length();i++){
            if(arr[str1.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}