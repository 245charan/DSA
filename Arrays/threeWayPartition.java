// Use two pointer approach TC -> O(n) SC -> O(1)

class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public static void swap(int array[], int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here  
        int left = 0;
        int right = 0;
        int i;
        for(i=0;i<=right;i++){
            if(array[i] < a){
                swap(array,left,i);
                left++;
            }else if(array[i] > b){
                swap(array,right,i);
                right--;
                i--;
            }
        }
    }
