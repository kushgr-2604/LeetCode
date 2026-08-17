class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int mini = Integer.MAX_VALUE;
        int s=0;
        int e= n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[s]<=nums[e]){
                mini=Math.min(mini,nums[s]);
                break;
            }
            if(nums[s]<=nums[mid]){
                mini=Math.min(mini,nums[s]);
                s=mid+1;
            }
            else{
                mini=Math.min(mini,nums[mid]);
                e= mid -1;
            }
        }
        return mini;
    }
}