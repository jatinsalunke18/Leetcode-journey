class Solution {
    public boolean checkDivisibility(int n) {
        int pro = 1;
        int sum = 0;
        int num = n;
        while(num>0){
            int dig = num%10;
            pro *= dig;
            sum += dig;
            num = num/10;
        }
        if(n%(pro+sum)==0) return true;
        return false;
    }
}