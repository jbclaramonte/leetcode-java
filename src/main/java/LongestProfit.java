public class LongestProfit {

  // Exercice d'un test technique d'un entretien

  public static int longestProfit(int[] data) {
    return search(1, 0, data);
  }

  private static int search(int longest, int i, int[] data) {
    int result = longest;
    for (int j = i + 1; j < data.length; j++) {
      if (data[j] > data[i]) {
        int tmpRes = search(longest + 1, j, data);
        if (tmpRes > result) {
          result = tmpRes;
        }
      }
    }
    return result;
  }
}
