import java.util .*;
public class DistinctIntegers{
public static List<List<Integer>> combinationSum(int[] arr, int target) {
Arrays.sort(arr);
Set<List<Integer>> result = new HashSet<>();
backtrack(arr, target, 0, new ArrayList<>(), result);
return new ArrayList<>(result);
}

private static void backtrack(int[] arr, int target, int index, List<Integer>
path, Set<List<Integer>> result) {
if (target == 0) {
result.add(new ArrayList<>(path));
return;
}

for (int i = index; i < arr.length; i++) {
if (arr[i] > target) break;
path.add(arr[i]);
backtrack(arr, target - arr[i], i + 1, path, result);
path. remove(path.size() - 1);
}
}

public static void main(String[] args) {
int[] arr = {10, 1, 2, 7, 6, 5};
int target = 8;
System.out.println(combinationSum(arr, target));
}

}