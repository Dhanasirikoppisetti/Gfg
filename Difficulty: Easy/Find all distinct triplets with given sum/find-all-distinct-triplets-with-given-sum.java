// User function Template for Java
class Solution {
    public List<List<Integer>> threeSum(int[] arr, int target) {
       Arrays.sort(arr);
       List<List<Integer>> res=new ArrayList<>();
       for(int i=0;i<arr.length-2;i++)
       {
           if(i>0 && arr[i]==arr[i-1]) continue;
           int left=i+1;
           int right=arr.length-1;
           while(left<right)
           {
               int sum=arr[i]+arr[left]+arr[right];
               List<Integer> ans=new ArrayList<Integer>();
               if(sum==target)
               {
                   ans.add(arr[i]);
                   ans.add(arr[left]);
                   ans.add(arr[right]);
                   res.add(ans);
                   while(left<right && arr[left]==arr[left+1])left++;
                   while(left<right && arr[right]==arr[right-1])right--;
                   left++;
                   right--;
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
       }
       return res;
        
    }
}