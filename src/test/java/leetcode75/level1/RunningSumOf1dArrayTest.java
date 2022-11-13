package leetcode75.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOf1dArrayTest {

  @Test
  public void simpleTest() {
    int[] tab = new int[]{1, 2, 3};
    int[] result = RunningSumOf1dArray.runningSum(tab);
    Assertions.assertThat(result).contains(1, 3, 6);
  }
}