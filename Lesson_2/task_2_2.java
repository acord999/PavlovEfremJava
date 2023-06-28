import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        try {
            FileWriter writer = new FileWriter("log.txt");
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                // Write current state of array to log file
                writer.write("After iteration " + (i + 1) + ": ");
                for (int num : arr) {
                    writer.write(num + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

