class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        int[] right = new int[n];
        int[] left = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i=1;i<n;i++){
            if(rating[i] > rating[i-1]) left[i] = left[i-1]+1;
            else left[i] = 1;
        }
        for(int i=n-2;i>=0;i--){
            if(rating[i] > rating[i+1]) right[i] = right[i+1]+1;
            else right[i] = 1;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.max(left[i],right[i]);
        }
        return sum;
    }
}