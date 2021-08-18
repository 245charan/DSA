// Smallest subarray with sum greater than x 

public static int sb(int arr[], int n, int x) {
        // Your code goes here 
        int curr_sum=0,start = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
                curr_sum += arr[i];
            while(curr_sum > x && start <= i){
                minLen = Math.min(minLen,i-start+1);
                curr_sum -=arr[start];
                start++;
            }
        }
        return minLen;
    }
