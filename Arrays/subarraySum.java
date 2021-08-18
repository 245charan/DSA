//Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int curr_sum=0,start = 0;
        ArrayList<Integer> results = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            if( i<n){
                curr_sum += arr[i];
            }
            while(curr_sum > s && start < i){
                curr_sum -=arr[start];
                ++start;
            }
            
            if( curr_sum == s){
                results.add(start+1);
                results.add(i+1);  
                return results;
                
            }
            
        }
        results.add(-1);
        return results;
    }




/** Algorithm
  1. Create three variables Curr_sum = 0, start = 0, last = 0
  2. Iterate through array util last element,assign i to last i.e. last = i; 
  3. Check if last is less than size of arr or simply add curr array value to Curr_sum i.e Curr_sum += arr[i]
  4. If the Curr_sum is greater than the given sum,then remove the starting element then update the Curr_sum -= arr[start] and start++
  5. If Curr_sum == sum, break the loop return start and last values 
  


*/
