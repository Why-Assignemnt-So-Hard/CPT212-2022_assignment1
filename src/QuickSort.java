import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickSort {
    //function to swap two elements
    static void swap(String[] array, int i, int j)
    {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(String[] array, int low, int high)
    {
        // pivot
        String pivot = array[high];
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = low - 1;
        for(int j = low + 1; j <= high - 1; j++)
        {
            // If current element is smaller
            // than the pivot
            if (array[j].compareToIgnoreCase(pivot) < 0)
            {
                // Increment index of
                // smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static String[] quickSort(String[] array, int low, int high)
    {
        if (low < high)
        {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pivot = partition(array, low, high);
            // Separately sort elements before
            // partition and after partition
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
        return array;
    }

    public static String[] readFile(String[] array, String fileName) throws FileNotFoundException {
        int i = 0;
        FileInputStream fis = new FileInputStream(fileName);
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine())
        {
            array[i] = sc.nextLine();
            i++;
        }
        sc.close();
        return array;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] array = new String[100];
        readFile(array, "wordList100.txt");
        String[] sortedArray = quickSort(array, 0, 99);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
}
