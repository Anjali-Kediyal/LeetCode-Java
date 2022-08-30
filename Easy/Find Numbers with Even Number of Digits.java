class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    boolean even(int num){
        int numberOfDigits = digits(num);
        // return numberOfDigits % 2 == 0;
        if(numberOfDigits % 2 == 0)
            return true;
        return false;
    }
    
    int digits(int num){
    /*
       //Count number of digits
        int count = 0;
        while(num>0){
            count++;
            num = num / 10;  // num /= 10
        }
        return count;
    */
     
    if(num<0){
        num = num * -1;
    }
        return (int) (Math.log10(num)+1); // Will count number of digits
        
    }
}
