class Solution {
    public int[] shuffle(int[] nums, int n) {
       int array_length= nums.length;
        int p=0;
        int arr[]=new int[array_length];
        for(int i=0;i<n;i++){
            arr[p]=nums[i];
            p++;
            if(p<array_length){
                arr[p]=nums[n+i];
            }
            p++;
        }
        return arr;
    }
}