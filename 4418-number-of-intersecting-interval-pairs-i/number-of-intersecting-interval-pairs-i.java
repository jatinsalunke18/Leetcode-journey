class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int cnt = 0;
        for(int i=0;i<n-1;i++){
            int min = intervals[i][0];
            int max = intervals[i][1];
            for(int j=i+1;j<n;j++){
                if(min<=intervals[j][1] && intervals[j][0]<=max) cnt++;
            }
        }
        return cnt;
    }
}