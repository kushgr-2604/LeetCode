class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length; 
        int[] freq = new int[n+1];

        for(int num: nums){
            freq[num]++;
        }
        int duplicate = -1;
        for(int i =1;i<= n;i++){
            if(freq[i] >1){
                duplicate = i;
            }
           
        }
        return duplicate;
    }
}