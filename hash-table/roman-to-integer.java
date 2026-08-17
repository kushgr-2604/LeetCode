class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int val_1= value(s.charAt(i));
            if(i+1<s.length()){
                int val_2= value(s.charAt(i+1));
                if(val_1>=val_2){
                    ans=ans + val_1;
                }
                else{
                    ans=ans+(val_2-val_1);
                    i++;
                }
            }
            else{
                ans=ans+val_1;
            }
        }
        return ans;
    }
    static int value(char z){
        if(z=='I'){
            return 1;
        }
        if(z=='V'){
            return 5;
        }
        if(z=='X'){
            return 10;
        }
        if(z=='L'){
            return 50;
        }if(z=='C'){
            return 100;
        }
        if(z=='D'){
            return 500;
        }
        if(z=='M'){
            return 1000;
        }
        return -1;
    }
}