class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min = Integer.MAX_VALUE;
        int max= 0;
        for(int i=0; i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int val = prices[i]-min;
            if(val >max){
                max =val;
            }
       }
       return max;
    }
}