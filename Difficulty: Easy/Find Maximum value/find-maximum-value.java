class Solution {
    // Function to find the maximum product of any two adjacent elements in the array.
    public int maxValue(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max_value=Integer.MIN_VALUE;
        while(left<right)
        {
            int ans=right-left;
            int res=Math.min(arr[left],arr[right]);
            int total=ans*res;
            max_value=Math.max(max_value,total);
        
        if(arr[left]<arr[right])
        {
            left++;
        }
        else
        {
            right--;
        }
    }
       return max_value;
    }
}