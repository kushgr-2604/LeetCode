class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] arrx = new int[n];
        Arrays.fill(arrx,-1);
        arrx[0] = 0;

        for(int i =0;i<n;i++){
            if(arrx[i] != -1){
                for(int j = i+1; j<n;j++){
                    int diff = Math.abs(nums[j]-nums[i]);

                    if(diff <= target){
                        arrx[j] = Math.max(arrx[j],arrx[i]+1); 
                    }
                }
            }
        }
        return arrx[n-1];
    }
}