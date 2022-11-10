import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/course-schedule/
// https://www.youtube.com/watch?v=EgI5nU9etnU
public class CourseSchedule207 {

  public void main() {

  }

  private Map<Integer, List<Integer>> prerequistesMap;


  public boolean canFinish(int numCourses, int[][] prerequisites) {
    prerequistesMap = convertToMap(numCourses, prerequisites);
    for (int course : prerequistesMap.keySet()) {
      if (dfs(new ArrayList<>(), List.of(course)) == false) {
        return false;
      }
    }
    return true;
  }

  public boolean dfs(List<Integer> checked, List<Integer> prerequistes) {
    for (int p : prerequistes) {
      if (checked.contains(p)) {
        return false;
      }
      checked.add(p);
      boolean result = dfs(new ArrayList(checked), prerequistesMap.get(p));
      if (!result) {
        return false;
      }
      checked.remove(checked.indexOf(p));
    }
    return true;
  }

  public static Map<Integer, List<Integer>> convertToMap(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> result = new HashMap<>();
    for (int c = 0; c < numCourses; c++) {
      result.put(c, new ArrayList<>());
    }
    for (int[] prerequisite : prerequisites) {
      List<Integer> prerequisteList = result.get(prerequisite[0]);
      prerequisteList
          .add(prerequisite[1]);
      result.putIfAbsent(prerequisite[0], prerequisteList);
    }
    return result;
  }
}
