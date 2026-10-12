class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1;
        int i = 1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak = 1;
            while(i<n && ratings[i]>ratings[i-1]){
                i++;
                peak++;
                sum+= peak;
            }
            int last = 1;
            while(i<n && ratings[i]<ratings[i-1]){
                i++;
                sum+=last;
                last++;
            }
            if(last>peak){
                sum+=last-peak;
            }
        }
        return sum;
    }
}