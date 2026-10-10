class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        int[] left = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            if(rating[i] > rating[i-1]) left[i] = left[i-1]+1;
            else left[i] = 1;
        }
        int cur = 1; int right = 1; int sum = Math.max(1,left[n-1]);
        for(int i=n-2;i>=0;i--){
            if(rating[i] > rating[i+1]){
                cur = right+1;
            }
            else cur = 1;
            right = cur;
            sum = sum+Math.max(left[i],cur);
        }
        return sum;
    }
}