class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == target){
                a.add(i);
            }else if(nums[i] > target){
                break;
            }
        }
        return a;
    }
}