/*


Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

*/


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null || nums.length==1)
        return 0;
 
    int result = nums.length;
 
    int start=0;
    int sum=0;
    int i=0;
    boolean exists = false;
 
    while(i<=nums.length){
        if(sum>=target){
            exists=true; //mark if there exists such a subarray 
            if(start==i-1){
                return 1;
            }
 
            result = Math.min(result, i-start);
            sum=sum-nums[start];
            start++;
 
        }else{
            if(i==nums.length)
                break;
            sum = sum+nums[i];
            i++;    
        }
    }
 
    if(exists)
        return result;
    else
        return 0;
    }
}
