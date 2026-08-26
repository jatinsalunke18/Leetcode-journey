class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int len = Integer.MAX_VALUE;
        int cnt = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') cnt++;

            ans.append(s.charAt(i));

            while(cnt>k){
                ans.deleteCharAt(0);
                if(s.charAt(j)=='1') cnt--;
                j++;
            }
            if(cnt==k){
                while(ans.charAt(0)=='0'){
                    ans.deleteCharAt(0);
                    j++;
                }
                int currlen = i-j+1;
                if(currlen< len || (currlen==len &&ans.toString().compareTo(temp.toString())<0)){
                    temp.setLength(0);
                    temp.append(ans);
                    len = currlen;
                }
                
            }
        }
        return temp.toString();
    }
}