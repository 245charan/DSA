// Minimum swaps and K together TC - O(n), SC - (1)

public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        if(n<=2) return 0;
        
        int WindowSize = 0;
        int res = Integer.MAX_VALUE;
        int minSwap = 0;
        
        for(int i = 0;i<arr.length;i++){
            if( arr[i] <= k) WindowSize++;
        }
        
        for(int i=0;i<WindowSize;i++){
            if(arr[i] > k) minSwap++;
        }
        
        for(int i = 0,j = WindowSize;j<n;i++,j++){
            if(arr[i] > k) minSwap--;
            if(arr[j] > k) minSwap++;
            res =Math.min(res,minSwap);
        }
        return res;
    }

/*
  => Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘WindowSize’.
  
  => Using two pointer technique for window of length ‘WindowSize’, each time keep track of how many elements
     in this range are greater than ‘k’. Let’s say the total count is ‘minSwap’.
     
  => Repeat step 2, for every window of length ‘WindowSize’ and take minimum of count ‘minSwap’ among them.
     This will be the final answer.
*/
