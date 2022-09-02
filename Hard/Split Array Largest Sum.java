class Solution {
    public int splitArray(int[] nums, int m) {
        int start = 0, end = 0;
        
        for(int i=0; i < nums.length; i++){
            start = Math.max(start, nums[i]); // at the end this will contain max item from array
            end = end + nums[i]; // this will retrun sum of entire array
        }
        
        while(start<end){
            int mid = start + (end - start) / 2;
            
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
            
        }
        return end; // here start == end
    }
}
