class Solution {
    public int maxWater(int arr[]) {
        int left=0;
        int right=arr.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(left<right)
        {
            if(arr[left]<arr[right])
            {
                lm=Math.max(lm,arr[left]);
                ans+=lm-arr[left];
                left++;
            }
            else
            {
                rm=Math.max(rm,arr[right]);
                ans+=rm-arr[right];
                right--;
            }
        }
        return ans;
    }
}
