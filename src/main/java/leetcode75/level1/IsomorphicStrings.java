package leetcode75.level1;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    Map<String, String> mapS2T = new HashMap<>();
    Map<String, String> mapT2S = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      String sChar = s.substring(i, i + 1);
      String tChar = t.substring(i, i + 1);

      String expectedChar4T = mapS2T.get(sChar);
      String expectedChar4S = mapT2S.get(tChar);

      if (expectedChar4T == null ^ expectedChar4S == null) {
        return false;
      }

      if (expectedChar4T == null) {
        mapS2T.put(sChar, tChar);
        mapT2S.put(tChar, sChar);
        continue;
      }

      if (!expectedChar4T.equals(tChar) && !expectedChar4S.equals(sChar)) {
        return false;
      }
    }

    return true;
  }

}
