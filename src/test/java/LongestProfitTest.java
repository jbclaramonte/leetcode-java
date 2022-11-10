import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestProfitTest {

  @Test
  public void should_retrun_3() {
    int[] profits = new int[] {-1, 9, 0, 8, -5, 6, -24};
    // result = 3 => -1, 0, 6 ou -1, 0, 8

    int longestProfit = LongestProfit.longestProfit(profits);

    Assertions.assertThat(longestProfit).isEqualTo(3);
  }
}