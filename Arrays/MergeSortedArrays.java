// Efficent Method 1
    
 class Solution {
    public int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2); // ceil the value; ceil(7/2) = 4
    }
    public void merge(int arr1[], int arr2[], int n, int m) {
        // gap is size of both elements
        int i, j, gap = n + m, tmp;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = tmp;
                }
            }

            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    tmp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }

            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        tmp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = tmp;
                    }
                }
            }
        }

    }
}

//Efficent Method 2 

/*
    => Create a variable to store last value of arr1
    => Traverse the arr1 from last second from right to left
    => Traverse the arr2 from right to left
    => Check weather the arr2 elemt is smaller than arr1 element 
       then update every ohter element with its left adjacent element.
    => If we find arr2 elements correct position then update the last element with current element of arr2
*/
class Solution{
public:
    void merge(int arr1[], int arr2[], int n, int m) {
	     for(int i=m-1;i>=0;i--){
	        int last = arr1[n-1];
	        for(int j=n-2;j>=0 && arr2[i]<arr1[j];j--){
	            arr1[j+1] = arr1[j];
	            if(j!=n-2 || last > arr2[i]){
	                arr1[j+1] = arr2[i];
	                arr2[i] = last;
	            }
	        }
	    }	    
	}
}
