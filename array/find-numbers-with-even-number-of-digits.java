class Solution {
    public int findNumbers(int[] nums) {
        
          int size = nums.length;
         int i,dig_count=0,temp=0,digit,flag=0;
        for(i=0;i<size;i++)
        {
            temp = nums[i];
            while(temp != 0)
            {
                digit = temp%10;
                dig_count++;
                temp= temp/10;
                
            }
            
          
            if(dig_count %2== 0)
            {
                flag ++;
            }
            dig_count=0;
        }
        return flag;
    }
}