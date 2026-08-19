class Solution {
    public int maxNumberOfFamilies(int n, int[][] reserved) {
        int cnt = 0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<reserved.length;i++){
            map.put(reserved[i][0], new ArrayList<>());
        }
        for(int i=0;i<reserved.length;i++){
            map.get(reserved[i][0]).add(reserved[i][1]);
        }
        for(int key:map.keySet()){
            int op1 = 1;
            int op2 = 1;
            int op3 = 1;
            for(int num:map.get(key)){
                if(num==2||num==3||num==4||num==5) op1 = 0;
                if(num==4||num==5||num==6||num==7) op2 = 0;
                if(num==6||num==7||num==8||num==9) op3 = 0;
            }
            if(op1==1 && op3==1) cnt+=2;
            else if(op1==1 || op2 ==1 || op3 == 1) cnt+=1;
        }
        return cnt+((n-map.size())*2);
    }
}