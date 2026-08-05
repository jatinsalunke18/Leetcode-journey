class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int sign = 1;
        int start = 0;
        if(s.length()==0) return 0;
        while(start<s.length()&&s.charAt(start)==' ') start++;
        for(int i=start;i<s.length();i++){
            if(s.charAt(i)=='-' && i == start){
                sign = -1;
                continue;
            }
            else if(s.charAt(i)=='+' && i == start) continue;
            else if(!Character.isDigit(s.charAt(i))) break;
            ans = ans*10+s.charAt(i)-'0';
            if(ans*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(ans*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)ans*sign;
    }
}