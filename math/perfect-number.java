class Solution {
    public boolean checkPerfectNumber(int num) {
      int  n = num,sum=0;
        for (int i = n - 1; i >= 1; i--) {
            if (num % i == 0)
                sum += i;
        }
        if (sum == num) {
            return true;
        } else
            return false;
    }
}