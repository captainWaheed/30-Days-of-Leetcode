class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
            int start = 0;
            int end = mat[0].length-1;
            int i=0;
            while(start<mat.length && end>=0){
                sum+=mat[i][start]+mat[i][end];
                if(start==end){
                    sum-=mat[i][start];
                }
                i++;
                start++;
                end--;
            }
            return sum;
    }
}