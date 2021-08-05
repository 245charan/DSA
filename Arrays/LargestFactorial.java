// WITHOUT USING BIGINTEGER

static void multiply(int nextFactorialnum,ArrayList<Integer> res){
        int carry=0,prod;
        for(int i = 0;i<res.size();i++){
            int temp = res.get(i);
            prod = res.get(i)*nextFactorialnum+carry;
            temp=prod%10;
            res.remove(i);
            res.add(i,temp);
            carry = prod/10;
        }
        while(carry!=0){
            res.add(carry%10);
            carry/=10;
        }
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        for(int nextFactorial = 2;nextFactorial<=N;nextFactorial++){
            multiply(nextFactorial,res);
        }
        Collections.reverse(res);
        return res;
        
    }

/**
=> Since the factorial of N can be a very large number. It can not be stored in a regular integer data type. 
=> To store the factorial use an array of digits. 
=> Use simple school mathematics to conduct each multiplication operation. Keep track of carry.


*/
