public class ArraySplitter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        int[][] result = splitArray(array, key);
        
        System.out.println("First Part: " + java.util.Arrays.toString(result[0]));
        System.out.println("Second Part: " + java.util.Arrays.toString(result[1]));
    }

    public static int[][] splitArray(int[] array, int key) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            return new int[][]{array}; // Return original array if key not found
        }
        
        int[] firstPart = java.util.Arrays.copyOfRange(array, 0, index);
        int[] secondPart = java.util.Arrays.copyOfRange(array, index, array.length);
        
        return new int[][]{firstPart, secondPart};
    }
}
