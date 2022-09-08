class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, col = 0;
        
        if(ruleKey.equals("type")){
            col = 0;
        }else if(ruleKey.equals("color")){
            col = 1;
        }else if(ruleKey.equals("name")){
            col = 2;
        }
        
        for (List<String> lis : items) {
            if (lis.get(col).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}
