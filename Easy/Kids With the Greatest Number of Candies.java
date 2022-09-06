class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int lar = 0;
        
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > lar){
                lar = candies[i];
            }
        }
        
        List<Boolean> ans = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++){
            candies[i] = candies[i] + extraCandies;
            
            if(candies[i] >= lar){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
