// arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int a[], int n) { 
        
        // Your code here
        int index=0;
        int maxi=0;
        int lmax =0;
        int rmax =0;
        int res =0;
        for(int i=0;i<n;i++){
            if(maxi <a[i]){
                index = i;
                maxi = a[i];
            }
        }
        
        for(int i=0;i<index;i++){
            if(lmax<a[i])
                lmax = a[i];
            else
                res+= lmax - a[i];
        }
        for(int i=n-1;i>index;i--){
            if(rmax <a[i])
                rmax = a[i];
            else    
                res+=rmax - a[i];
        }
            return res;
        
        
    }