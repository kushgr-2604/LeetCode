class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr= new String[n];
        for(int i=0;i<n;i++)
       {    
           int num = i + 1;
           if((num%3==0) && (num  %5 == 0))
           {
               arr[i]="FizzBuzz";
           }
           else if(num %3==0)
           {
               arr[i]="Fizz";
           }
           else if(num %5 == 0)
           {
               arr[i]="Buzz"; 
           }
           else
           {
               arr[i]=String.valueOf(num);
            }
       }
       return Arrays.asList(arr);
    }
}