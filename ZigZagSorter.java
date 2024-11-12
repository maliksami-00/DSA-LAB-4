import java.util.Arrays;
public class ZigZagSorter {
    public static void zigzagSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {14, 13, 17, 18, 16, 12, 11};
        zigzagSort(arr);
        System.out.println("Zigzag sorted array: " + Arrays. toString(arr));
    }

}