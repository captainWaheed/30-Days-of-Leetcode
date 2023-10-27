class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int l = heights.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    String newName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = newName;
                }
            }
        }
        return names;
    }
}