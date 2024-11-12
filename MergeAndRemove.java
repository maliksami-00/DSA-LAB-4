import java.util.Arrays;
import java.util.HashSet;

public class MergeAndRemove {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeAndRemoveDuplicates(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        Arrays.sort(result);
        return result;
    }
}
