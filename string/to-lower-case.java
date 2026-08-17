class Solution {
    public String toLowerCase(String s) {
         String wrd= "";
        for(int i=0;i<s.length(); i++){
            char x= s.charAt(i);
            if (x >= 'A' && x <= 'Z')
                x = (char)(x + 32);
            wrd = wrd+x;
        }
        return wrd;
    }
}