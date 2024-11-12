public class EvenOddCounter {
    public static void main(String[] args) {
    int[] numbers = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int evenCount = 0;
    int oddCount = 0;
    
    for (int number : numbers) {
    if (number % 2 == 0) {
    evenCount++;
    } else {
    oddCount++;
    
    }
    
    }
    System.out.println("Even numbers: " + evenCount);
    System.out.println("Odd numbers: " + oddCount);
    
    }
    
    }