import java.util.Scanner;
public class RealNumbers {
public static void main(String[] args) {
double[] numbers = new double[7];
double sum = 0.0;
double mean;

Scanner input = new Scanner(System.in);
System.out.println("Enter 7 real numbers:");

for (int i = 0; i < numbers. length; i++) {
numbers[i] = input.nextDouble();
sum += numbers[i];
}
mean = sum / numbers. length;
System.out.println("Sum: " + sum);
System.out.println("Mean: " + mean);
}
}