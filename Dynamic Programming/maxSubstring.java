/*
Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)
Example 1:

Input : S = "11000010001" 
Output : 6 
Explanatio: From index 2 to index 9, 
there are 7 0s and 1 1s, so number 
of 0s - number of 1s is 6. 
Example 2:

Input: S = "111111"
Output: -1
Explanation: S contains 1s only */


// Method I TC -> O(n) SC -> O(1)
// Assume o as 1 and 1 as -1, then apply Kadane’s algorithm

class Solution {
    int maxSubstring(String S) {
        // code here
        int local_max = 0;
        int global_max = 0;
        for(int i=0;i<S.length();i++){
            
            local_max += ( S.charAt(i) == '0' ? 1 : -1 );
            if(local_max<0){
                local_max=0;
            }
            
            global_max = Math.max(local_max, global_max);
        }
        if(global_max == 0){
            global_max = -1;
        }
        return global_max;
    }
}
