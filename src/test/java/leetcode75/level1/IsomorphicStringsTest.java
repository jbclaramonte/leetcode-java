package leetcode75.level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {

  @Test
  public void simpleTest1() {
    Assertions.assertThat(new IsomorphicStrings().isIsomorphic("egg", "add")).isTrue();
  }

  @Test
  public void simpleTest2() {
    Assertions.assertThat(new IsomorphicStrings().isIsomorphic("foo", "bar")).isFalse();
  }

  @Test
  public void simpleTest3() {
    Assertions.assertThat(new IsomorphicStrings().isIsomorphic("badc", "baba")).isFalse();
  }
}