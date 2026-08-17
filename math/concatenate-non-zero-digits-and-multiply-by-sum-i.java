class Solution {
    public long sumAndMultiply(int n) {
        if(n== 0)return 0;
        int temp  = n;
        long x= 0;
        long place  = 1; 
        int sum =0;
        while(temp > 0) {
            int digit = temp % 10;
            if (digit != 0) {
                x += digit * place;
                place *= 10;
                sum += digit;
            }
            temp /= 10;
        }

        return (x * sum);
    }
}