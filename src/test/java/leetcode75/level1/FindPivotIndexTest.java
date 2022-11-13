package leetcode75.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

  @Test
  public void simpleTest() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    int pivotIndex = new FindPivotIndex().pivotIndex(nums);
    Assertions.assertThat(pivotIndex).isEqualTo(3);
  }

  @Test
  public void cornerCase1Test() {
    int[] nums = {2, 1, -1};
    int pivotIndex = new FindPivotIndex().pivotIndex(nums);
    Assertions.assertThat(pivotIndex).isEqualTo(0);
  }

  @Test
  public void cornerCase2Test() {
    int[] nums = {-1, -1, -1, -1, -1, -1};
    int pivotIndex = new FindPivotIndex().pivotIndex(nums);
    Assertions.assertThat(pivotIndex).isEqualTo(-1);
  }
}