class Solution {
    public int smallestNumber(int n, int t) {
        int pro = 1;
        int num = n;
        // while(num>0){
        //     int dig = num%10;
        //     num = num/10;
        //     pro *= dig;
        // }
        // if(pro%t == 0) return n;
        while(pro!=t){
            while(num>0){ 
                pro *= num%10;
                num = num/10;
            }
            if(pro%t == 0) return n;
            num = ++n;
            pro = 1;
        }
        return n;
    }
}