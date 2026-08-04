class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        int xor = 0;
        while(n-->0){
            xor^=start+2*i;
            i++;
        }
        return xor;
    }
}