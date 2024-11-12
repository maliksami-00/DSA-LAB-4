public class MissingNumberFinder {
    public static int findMissingNumber(int[] nums) {
    int n = nums.length;
    int total = n * (n + 1) / 2;
    int sum = 0;
    for (int num : nums) {
    sum += num;
    
    }
    return total - sum;
    }
    
    public static void main(String[] args) {
    int[] nums = {0, 1, 2, 3, 5};
    int missingNumber = findMissingNumber(nums);
    System.out.println("The missing number is: " + missingNumber);
    }
}