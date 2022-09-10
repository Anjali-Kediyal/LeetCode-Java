class Solution {
    public double average(int[] salary) {
        double total = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < salary.length; i++){
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        
        for(int i = 0; i < salary.length; i++){
            if(salary[i]!= min && salary[i]!= max){
                total += salary[i];
            }
        }
        
        double ans = total / (salary.length-2);
        
        return ans;
        
    }
}
