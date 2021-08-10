int remove_duplicate(int[] nums){
    // code here
    if(nums.length == 0)
        return 0;
    int i=0;
    for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i]){
            i++;
            nums[i]=nums[j];
        }
    }
   return i+1;
  }

/**
  => Use 2 pointer technique.
  => initialize a pointer one to first index and 2nd pointer to 2nd index.
  => Check the condition if both the elements are different then increment the 
      1st pointer by 1 and update Array[1st pointer] = Array[2nd Pointer].

*/
