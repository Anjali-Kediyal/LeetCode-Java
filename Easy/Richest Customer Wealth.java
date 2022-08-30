class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        // person = row, account = column
        for(int person = 0; person < accounts.length; person++){
            int rowsum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                rowsum += accounts[person][account];
            }
            // checking for largest sum
            if(rowsum > max)
                max = rowsum;
        }
        return max;
    }
}
