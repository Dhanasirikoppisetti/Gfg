// User function Template for Java

class Solution {

    long countSubarray(int arr[], int n, int k) {
       long count=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {
               if(arr[j]>k)
               {
                   count+=(n-j);
                   break;
               }
           }
       }
       return count;
        
    }
}