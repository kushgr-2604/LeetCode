class Solution {
    public int countMonobit(int n) {
          int count = 1; // for 0
        int k = 1;

        while (true) {
            int num = (1 << k) - 1;  // 2^k - 1

            if (num <= n)
                count++;
            else
                break;

            k++;
        }

        return count;
    }
}