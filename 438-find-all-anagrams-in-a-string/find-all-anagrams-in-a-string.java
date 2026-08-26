class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] freq1 = new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            boolean flag = true;
            int[] freq2 = new int[26];
            for(int j=i;j<i+p.length();j++){
                freq2[s.charAt(j)-'a']++;
            }
            for(int j=0;j<freq1.length;j++){
                if(freq1[j]!=freq2[j]) flag = false;
            }
            if(flag) ans.add(i);
        }
        return ans;
    }
}