// Expected Time Complexity: O(NLogN).
// Expected Auxiliary Space: O(N).

class Solution
{

    static long inversionCount(long arr[], long n)
    {
        long temp[] = new long[(int)n];
        //returning the count of inversions in the array.
        return _mergeSort(arr, temp, 0, n - 1); 
    }
    
    static long _mergeSort(long arr[], long temp[], 
        long left, long right)
    {
        long mid, inv_count = 0; 
        if (right > left) { 
            mid = (right + left) / 2;
            
            inv_count = _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        return inv_count; 
    }
    
    static long merge(long arr[], long temp[], long left,
    long mid, long right) 
    { 
        long i, j, k; 
        long inv_count = 0; 
        //i is pointer for left subarray.
        i = left;
        //j is pointer for right subarray.
        j = mid; 
        //k is index for resultant merged subarray.
        k = left; 
        
        //Using two pointers over the array which helps in storing the
        //smaller element and thus merging the subarray.
        while ((i <= mid - 1) && (j <= right)) {
            
            //Comparing element of the array at pointers i and j and accordingly
            //storing the smaller element and updating the pointers.
            if (arr[(int)i] <= arr[(int)j]) { 
                temp[(int)k++] = arr[(int)i++]; 
            } 
            else { 
                temp[(int)k++] = arr[(int)j++]; 
                //Adding the inversions which is the number of elements which 
                //are smaller than arr[j] in the left half of the array.
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
        //Copying the remaining elements of left subarray(if there are any) 
        //to temp.
        while (i <= mid - 1)  
            temp[(int)k++] = arr[(int)i++]; 
  
        //Copying the remaining elements of right subarray(if there are any)
        //to temp.
        while (j <= right) 
            temp[(int)k++] = arr[(int)j++]; 
  
        //Copying back the merged elements to original array.
        for (i = left; i <= right; i++) 
            arr[(int)i] = temp[(int)i]; 
  
        return inv_count; 
    }
    
}
/*
We basically need to make the comparisons in the existing array and while doing any comparison,
we need to know that how would the two numbers being compared would be ordered in the sorted version of this array.
So, how about running a sorting algorithm itself?
The algorithms like Bubble Sort, Insertion Sort and Selection sort are O(n2). 
We can achieve this complexity even via the naive approach discussed in the previous hint, so no use of it.

What about getting to this via merge sort?


Use Merge sort algorithm, and sort the array.
=> In merge function for merge sort, while comparing the elements, if element in right array is smaller, then it is an inversion (Why..??)
=> This means that this smaller element in the original array, is behind larger elements. 
=> So add the number of larger elements or elements left in the left-array, to the value of counter.
=> This process is repeated again and again for complete Merge Sort
=> Finally output counter variable. This is the answer.





*/
