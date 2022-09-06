class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, left = 0, right = n;
        int [] ans = new int[nums.length];
        while(right != nums.length && left !=n){
            ans[i] = nums[left];
            i++;
            left++;
            ans[i] = nums[right];
            i++;
            right++;
        }
        return ans;
    }
}
