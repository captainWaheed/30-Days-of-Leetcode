class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] sides = new int[rectangles.length];
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i][0] < rectangles[i][1])
                sides[i] = rectangles[i][0];
            else
                sides[i] = rectangles[i][1];
        }

        for (int num : sides)
            if(num > maxLen) maxLen = num;

        for(int num : sides)
            if(num == maxLen) count++;

        return count;
    }
}