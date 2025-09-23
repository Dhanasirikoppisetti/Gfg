// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int start=0;
        int sum=0;
        int min_len = Integer.MAX_VALUE;
        for(int end=0;end<arr.length;end++)
        {
            sum+=arr[end];
      while(sum>x)
       {
         min_len=Math.min(min_len,end-start+1);
         sum -= arr[start];
         start++;
       }
    }
      if(min_len==Integer.MAX_VALUE)
      {
          return 0;
      }
      return min_len;
    }
}
