class Solution {
    public int missingNumber(int[] nums) {
        cyclic(nums);
        int ans=0, n = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!= i){
                return i;
            }
        }
        return n;
    }
    
    public void cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                swap(nums, i, nums[i]);
            }else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
