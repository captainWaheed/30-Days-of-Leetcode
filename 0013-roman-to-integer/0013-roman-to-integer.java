class Solution {
    public int romanToInt(String s) {
        int[] arr = new int[26];
        arr['I'-'A']=1;
        arr['V'-'A']=5;
        arr['X'-'A']=10;
        arr['L'-'A']=50;
        arr['C'-'A']=100;
        arr['D'-'A']=500;
        arr['M'-'A']=1000;

        int last=0;
        int ans=0;
        for(int i:s.toCharArray()){
            int v = arr[i-'A'];
            ans+=v;
            if(v>last){
                ans-=2*last;
            }
            last=v;
        }
        return ans;
    }
}