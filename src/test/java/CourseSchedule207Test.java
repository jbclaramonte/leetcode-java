import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class CourseSchedule207Test {

  @Test
  public void should_be_true() {
    int[][] pre = new int[][]{{1, 0}};
    assertThat(new CourseSchedule207().canFinish(2, pre)).isTrue();
  }

  @Test
  public void should_be_true2() {
    int[][] pre = new int[][]{{1, 4}, {2, 4}, {3, 1}, {3, 2}};
    assertThat(new CourseSchedule207().canFinish(5, pre)).isTrue();
  }

  @Test
  public void should_be_false() {
    int[][] pre = new int[][]{{1, 0}, {0, 1}};
    assertThat(new CourseSchedule207().canFinish(2, pre)).isFalse();
  }

  @Test
  public void should_be_false2() {
    int[][] pre = new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1},
        {17, 4}};
    assertThat(new CourseSchedule207().canFinish(20, pre)).isFalse();
  }

  @Test
  public void should_be_true3() {
    int[][] pre = new int[][]{{1, 0}, {2, 6}, {1, 7}, {6, 4}, {7, 0}, {0, 5}};
    assertThat(new CourseSchedule207().canFinish(8, pre)).isTrue();
  }

  @Test
  public void should_return_prerequiste_map() {
    int[][] pre = new int[][]{{1, 0}, {0, 1}};
    Map<Integer, List<Integer>> prereqMap = CourseSchedule207.convertToMap(2, pre);
    assertThat(prereqMap.get(0)).containsExactlyInAnyOrder(1);
    assertThat(prereqMap.get(1)).containsExactlyInAnyOrder(0);
  }
}