class Solution {
    public int candy(int[] rating) {
        int n = rating.length;
        int sum = 1;
        int i=1;
        while(i<n){
            if(rating[i]==rating[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak = 1;
            while(i<n && rating[i]>rating[i-1]){
                i++;
                peak+=1;
                sum+=peak;
            }
            int down = 1;
            while(i<n && rating[i]<rating[i-1]){
                sum += down;
                i++;
                down++;
            }
            if(down>peak){
                sum+= down-peak;
            }
        }
        return sum;
    }
}