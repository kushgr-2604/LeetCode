class Solution {
    public long sum(long n){
        long s =(n*(n+1))/2;
        return s;
    }
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long finalsum =0 ; 
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0 ){
                count++;
            }
            else if(nums[i] !=0){
                finalsum +=sum(count);
                count =0;
            }
        }
        finalsum += sum(count);
        return finalsum;
    }
}