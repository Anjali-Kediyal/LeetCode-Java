class Solution {
    public int findDuplicate(int[] nums) {
        cyclic(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
    }
    
     public void cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
