public class ArraySwap {
    public static void main(String[] args) {
    int[] array1 = {10, 20, 30, 40};
    int[] array2 = {50, 60, 70, 80};
    
    for (int i = 0; i < 4; i++) {
    int temp = array1[i];
    array1[i] = array2[i];
    array2[i] = temp;
    
    }
    
    System.out.println("Array 1: " + java.util.Arrays.toString(array1));
    System.out.println("Array 2: "+ java.util.Arrays.toString(array2));
    
    }
    
    }