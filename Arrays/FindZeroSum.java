class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
   //   Method 1
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        // if(n < 2) return false;
        HashMap<Integer, Integer> hM =  
                            new HashMap<Integer, Integer>(); 
              
            int sum = 0;       
            for (int i = 0; i < arr.length; i++) 
            {  
                sum += arr[i]; 
                if (sum == 0 || hM.get(sum) != null)                          
                    return true; 
                //storing every prefix sum obtained in Hashmap.
                hM.put(sum, i); 
            }  
            //returning false if we don't get any subarray with 0 sum.
            return false;
    }
  // Method 2
   static boolean findsum {
    Set<Integer> set = new Hashset<Integer>();
        int sum = 0;
        for(int a: arr){
            sum+=a;
            if(set.contains(sum) || a == 0 || sum == 0) return true;
            set.add(sum);
        }
        return false;
    }
};

/**
=> if prefix sum is 0 or if it is already present in Hashmap
  then it is repeated which means there is a subarray whose 
  summation is 0, so we return true.
=>
*/
