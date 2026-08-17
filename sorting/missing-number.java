class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int [] ans =new int[n+1];

        // for(int i=0; i<n+1; i++){
        //     ans[i]= -1;
        // }
        // for(int i=0; i<n; i++){
        //     ans[nums[i]]=nums[i];
        // }
        // for(int i=0; i<n+1; i++){
        //     if(ans[i]==-1){
        //         return i;
        //     }
        // }
        // return -1;
        int n = nums.length;
        
        int sumofNatural = (n*(n+1))/2;

        int totalSum = 0;
        for(int i=0; i< n; i++){
            totalSum+=nums[i];
        }
        return sumofNatural-totalSum;


    }
}