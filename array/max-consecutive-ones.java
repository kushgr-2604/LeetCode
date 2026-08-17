class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count =0;
        // int max = 0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         count++;
        //     max= Math.max(max,count);
        //     }
        //     else {
        //         count =0;
        //     }
           
        // }
        //  return max;
        int n = nums.length;

        int cnt=0;
        int maxi=0;

        for(int i =0; i<n;i++){
            if(nums[i]==1){
                cnt++;
            }
            if(nums[i]!=1){
                cnt=0;
            }
            if(cnt>maxi){
                maxi= cnt;
            }
        }
        return maxi;
    }
}