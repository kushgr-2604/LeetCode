class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        s=s.toLowerCase();
        int l= s.length();
        for( int i =0; i<l-1;i++)
        {
            char x= s.charAt(i);
            char y= s.charAt(i+1);
            sum+=Math.abs((int)x-(int)y);
        }
        return sum;
    }
}