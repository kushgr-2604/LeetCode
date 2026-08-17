class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        String wrd="";
        boolean started =false;
        for(int i = n-1 ; i>= 0;i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                wrd = wrd+ ch;
                started = true; 
            }
            else if(started){
                break;
            }
        }
        return wrd.length();
    }

}