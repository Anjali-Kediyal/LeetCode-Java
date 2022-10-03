class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int i = 0;
        
        while (i < neededTime.length) {
            int j = i + 1;
            int minTime = neededTime[i];

            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                if (minTime <= neededTime[j]) {
                    time += minTime;
                    minTime = neededTime[j];
                } else {
                    time += neededTime[j];
                } 
                j++;
            }
            i = j;
        }
        return time;
    }
}
