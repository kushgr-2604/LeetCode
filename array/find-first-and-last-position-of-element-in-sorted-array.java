class Solution {
    int firstpos(int[] nums, int t){
            int n = nums.length;   
            int first = -1; 
            int s=0;
            int e =n-1;

            while(s<=e){
                int mid =(s+e)/2;

                if(nums[mid]== t){
                    first = mid;
                    e= mid-1;
                }

                else if (t> nums[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return first;
        }
        int lastpos(int[] nums, int t){
             int n = nums.length;   
            int last = -1; 
            int s=0;
            int e =n-1;

            while(s<=e){
                int mid =(s+e)/2;

                if(nums[mid]== t){
                    last = mid;
                    s= mid+1;
                }

                else if (t> nums[mid]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return last;
        }
    public int[] searchRange(int[] nums, int target) {
       
            int first = firstpos(nums, target);
            int last = lastpos(nums, target);
            int[] ans =new int[2];
            ans[0]=first;
            ans[1]=last;
            return ans;
        }
    }
