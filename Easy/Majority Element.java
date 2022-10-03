class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length==1){
            return 1;
        }
        int c=1;
        for (int i=0;i<nums.length-1;i++){
            c=0;
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    c++;
                }
            }
            System.out.println(c);
            if (c>=nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}
