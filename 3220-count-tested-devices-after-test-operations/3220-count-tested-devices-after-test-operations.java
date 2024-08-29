class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int d = 0;
        int ans = 0;
        for(int batteryP : batteryPercentages){
            if(batteryP > d){
                ans++;
                d++;
            }
        }
        return ans;
    }
}