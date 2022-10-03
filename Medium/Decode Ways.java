class Solution {
    public int numDecodings(String s) {
        
        if(s.length() == 0 || s.charAt(0) == '0'){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        int count1 =1, count2 = 1;
        
        for(int i=1;i<s.length();i++){
            
            int count =0;
            
            int d1 = Integer.parseInt(s.charAt(i)+"");
            int d2 = Integer.parseInt(s.substring(i-1,i+1));
            
            if(d1 > 0) count += count2;
            if(d2 >=10 && d2 <=26) count +=count1;
            
            count1 = count2;
            count2 = count;
            
        }
        return count2;
        
    }
}
