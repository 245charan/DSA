class Solution{
    public:
    
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void reverse(int arr[],int i,int j){
        int temp = 0
        while(i<j){
            temp = arr[j];
            arr[j] = arr[i];
            arr[j] = temp;
            i++;j--;
        }
    }
    void rotateArr(int arr[], int d, int n){
        // code here
        reverse(arr,0,n-1); //5 4 3 2 1 
        reverse(arr,0,n-d-1);//3 4 5 2 1
        reverse(arr,n-d,n-1);//3 4 5 1 2
    }
};
