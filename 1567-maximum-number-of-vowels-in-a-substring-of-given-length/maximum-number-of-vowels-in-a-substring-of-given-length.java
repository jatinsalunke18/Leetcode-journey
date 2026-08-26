class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o') max++;
        }
        int cnt = max;

        
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o') cnt++;
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='u'||s.charAt(i-k)=='o') cnt--;
            max = Math.max(max,cnt);
        }
        return max;
    }
}