class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2) return 0;

        int maxi=Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            maxi=Math.max(maxi,(nums[i]-nums[i-1]));
        }

        return maxi;
    }
}