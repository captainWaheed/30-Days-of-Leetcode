class Solution {
    public int largestAltitude(int[] gain) {
      int[] altitude = new int[gain.length + 1];
      altitude[0] = 0;
      for(int i = 0; i < gain.length; i++){
        altitude[i+1] = altitude[i] + gain[i];
      }

      return max(altitude);
    }

    public int max(int[] arr){
        int max = arr[0];
        for(int val: arr){
            if (val > max){
                max = val;
            }
        }
        return max;
    }
}