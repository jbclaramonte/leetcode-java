package leetcode75.level1;

public class RunningSumOf1dArray {

  // https://leetcode.com/problems/running-sum-of-1d-array/
  public static int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    result[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      result[i] = nums[i] + result[i - 1];
    }
    return result;
  }
}
