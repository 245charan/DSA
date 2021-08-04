void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            if(arr[i]<0)
                neg.add(arr[i]);
            else    
                pos.add(arr[i]);
        }
        int i=0,j=0,k=0;
        while(i<n){
            if(j<pos.size())
                arr[i++] = pos.get(j++);
            if(k<neg.size())
                arr[i++] = neg.get(k++);
        }
    }



/***
Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Example 2:

Input: 
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0 
*/
