package leetcode75.level1;

public class FindPivotIndex {

  // https://leetcode.com/problems/find-pivot-index/
  public int pivotIndex(int[] nums) {
    int sum = sum(nums);

    int left = 0;
    for (int i = 0; i < nums.length; i++) {
      int val = nums[i];
      int right = sum - left - val;

      if (left == right) {
        return i;
      }

      left = left + val;
    }
    return -1;
  }

  public int sum(int[] nums) {
    int sum = 0;
    for (int v : nums) {
      sum = sum + v;
    }
    return sum;
  }
}
