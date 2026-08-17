class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m){
            return false;
        }

        int[] ans = new int[26];

        for(int i = 0;i< m;i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;

            }
        for(int i=0;i<26;i++){
            if(ans[i]>= 1)
                return false;
        }

        return true;    
    }
}