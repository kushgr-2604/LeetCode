class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];

        for(int q = 0; q< queries.length; q++){
            int k = queries[q][0];
            int trim = queries[q][1];

            Integer[] index = new Integer[nums.length];

            for(int i = 0; i< nums.length; i++){
                index[i] = i;
            }

            Arrays.sort(index,(a,b) -> {
                String x = nums[a].substring(nums[a].length() - trim);
                String y = nums[b].substring(nums[b].length() - trim);

                int cmp = x.compareTo(y);

                if(cmp != 0){
                    return cmp;
                }

                return a-b;
            });

            ans[q] = index[k-1];
        }
        return ans;
    }
}