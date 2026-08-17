class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        double max_Area =0;
        int i =0;
        int j=n-1;
        while(i<j){
            int area = (j-i)* Math.min(height[i], height[j]);
            max_Area= Math.max(max_Area,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return (int)max_Area;
    }
}