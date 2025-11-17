// User function Template for Java

class Solution {
    static class Timing{
        int start;
        int end;
        public Timing(int start, int end){
            this.start=start;
            this.end= end;
        }
    }
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int minPlatform(int arr[], int dep[]) {
        // add your code here
       Arrays.sort(arr);
       Arrays.sort(dep);
       int i=0;
       int j=0;
       int n=arr.length;
       int cnt=0;
       int max=0;
       while(i<n && j<n){
           if(arr[i]<=dep[j]){
               cnt++;
               i++;
           }else if(dep[j]<arr[i]){
               cnt--;
               j++;
           }
           max=Math.max(cnt,max);
       }
       return max;
       
        
    }
}