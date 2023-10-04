class Solution {
  public int arraySign(int[] nums) {
    var product = 1;

    for (var n : nums) {
      if (n == 0) return 0;
      product *= n > 0 ? 1 : -1;
    }
    return product;
  }
}