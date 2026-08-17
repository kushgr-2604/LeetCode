class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        List<Integer> ar = new ArrayList<>(triangle.get(n-1));

        for(int i = n-2;i >= 0; i--){
            for(int j =0; j <= i;j++){
                ar.set(j,triangle.get(i).get(j)+Math.min(ar.get(j),ar.get(j+1)));
            }
        }

        return ar.get(0);
    }
}