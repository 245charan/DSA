class Solution {
    public void nextPermutation(int[] nums) {
        int lastAscdIndex = -1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]) {
                lastAscdIndex = i;
            }
        }

        // Already in reverse order. Return reverse.
        if(lastAscdIndex == -1){
            reverse(nums, 0, nums.length);
            return;
        }

        //Find the minum number that is greater than nums[index+1]
        int minIndex = lastAscdIndex + 1;
        for(int i = lastAscdIndex+1; i < nums.length; i++){
            if(nums[i] > nums[lastAscdIndex] && nums[lastAscdIndex] < nums[minIndex])
                minIndex = i;
        }

        // Swap
        int temp = nums[lastAscdIndex];
        nums[lastAscdIndex] = nums[minIndex];
        nums[minIndex] = temp;

        // Reverse the rest numbers
        reverse(nums, lastAscdIndex+1, nums.length);
        return;

    }

    public void reverse(int[] nums, int start, int end){
        for(int i = start; i < (start + end + 1)/2; i++){
            int temp = nums[i];
            nums[i] = nums[start + end -i -1];
            nums[start + end -i -1] = temp;
        }
    }
}
