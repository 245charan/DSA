class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Set<long> hash = new HashSet<>();
        for(long i : a1)
            hash.add(i);
            
        int size = hash.size();
        for(long i : a2){
            hash.add(i);
        }
        
        return size == hash.size()? "Yes" : "No";
    }    
        
}
