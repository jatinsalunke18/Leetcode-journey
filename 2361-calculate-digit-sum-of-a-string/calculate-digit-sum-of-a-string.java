class Solution {
    public String digitSum(String s, int k) {
        String sum = "";
        int cnt = k;
        int temp = 0;

        while(s.length() > k){ 
            for(char c : s.toCharArray()){
                temp += c - '0';
                cnt--;

                if(cnt == 0){
                    sum += temp;
                    temp = 0;
                    cnt = k;
                }
            }

            if(cnt != k){ 
                sum += temp;
            }

            temp = 0; 
            cnt = k;
            s = sum;
            sum = "";
        }

        return s; // Return final string
    }
}