// Method 1 => Two traversal technique

long maxProduct(int[] arr, int n) {
        // code here
        long max_fwd = Integer.MIN_VALUE;
        long max_bkd = Integer.MIN_VALUE;
        long max_till_now = 1;
        boolean isZero = false;
        
        for(int i=0;i<n;i++){
            
            max_till_now = max_till_now*arr[i];
            if(max_till_now == 0){
                isZero = true;
                max_till_now = 1;
                continue;
            }
            max_fwd = Math.max(max_till_now,max_fwd);
        }
        
        max_till_now = 1;
        
        for(int i=n-1;i>=0;i--){
            max_till_now*=arr[i];
            if(max_till_now == 0){
                isZero = true;
                max_till_now =1;
                continue;
            }
            max_bkd = Math.max(max_bkd,max_till_now);
        }
        
        long res = Math.max(max_fwd,max_bkd);
        
        if(isZero){
            res = Math.max(res,0);
        }
        
        return res;
    }
