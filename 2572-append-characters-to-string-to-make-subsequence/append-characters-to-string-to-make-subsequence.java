class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        int i=0;
        while(i<t.length() && s.charAt(i)==t.charAt(i)) i++;
        int first = i;
        int second = i;
        while(first<s.length()){
            if(s.charAt(first)==t.charAt(second)){
                first++;
                second++;
            }
            else first++;
        }
        return t.length()-second;
    }
}