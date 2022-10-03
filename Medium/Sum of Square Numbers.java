class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j= (int) (Math.sqrt(c)) ;
        
        while(i<=j){ 
            long ans=j*j+(i*i); 
            if(ans==c) return true;
            if(ans>c ) j--;
            else i++;
        }
        return false;
    }
}
