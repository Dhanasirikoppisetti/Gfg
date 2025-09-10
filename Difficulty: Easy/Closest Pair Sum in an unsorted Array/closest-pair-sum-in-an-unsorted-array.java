class Solution {
    public List<Integer> closestPairSum(int arr[], int target) {
        Arrays.sort(arr);
        
       List<Integer> res=new ArrayList<Integer>();
       int left=0;
       int right=arr.length-1;
      int min_diff = Integer.MAX_VALUE;
       while(left<right)
       {
           
           int sum=arr[left]+arr[right];
              int diff=Math.abs(sum-target);
             if(diff<min_diff)
             {
                 min_diff=diff;
                 res.clear();
                 res.add(arr[left]);
                 res.add(arr[right]);
             }
           if(sum==target)
           {
              return res;
           }
           else if(sum<target)
           {
               left++;
           }
           else
           {
               right--;
           }
         
            
            
       }
       return res;
       
    }
    
}
