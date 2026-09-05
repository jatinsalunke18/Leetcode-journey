class Solution {
    int rev(int rev,int n){
        if(!(n>0)) return rev;
        rev = rev*10 + n%10;
        return rev(rev,n/10);
    }
    public int mirrorDistance(int n) {
        if(n<10) return 0;
        int rev = rev(0,n);
        return Math.abs(rev-n);
    }
}