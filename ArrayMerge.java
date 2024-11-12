import java.util.Arrays;
public class MyArray {
private int[] data;
public MyArray(int[] initialData) {
this.data = initialData;

public void merge(int[] newArray) {

int[] mergedArray = new int[this.data.length + newArray.length];

System.arraycopy(this.data, 0, mergedArray, 0, this.data.length);
System. arraycopy(newArray, 0, mergedArray, this.data.length, newArray
.length);
this.data = mergedArray;

public void display() {
System.out.println(Arrays.toString(this.data));

public static void main(String[] args) {
MyArray myArray = new MyArray(new int[]{10, 20, 30});
System.out.print("Before merging: ");
myArray.display();
myArray.merge(new int[]{40, 50, 60});
System.out.print("After merging: ");
myArray.display();

}

}

}