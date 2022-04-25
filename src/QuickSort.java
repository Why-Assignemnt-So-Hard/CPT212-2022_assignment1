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

    static int partition(String[] array, int low, int high, Counter counter)
    {
        counter.counter += 2;                                           // String pivot = array[high]
        String pivot = array[high];
        counter.counter += 2;                                           // int i = low - 1
        int i = low - 1;
        counter.counter += 2;                                           // int j = low + 1
        for(int j = low + 1; j <= high - 1; j++)
        {
            counter.counter += 3;                                       // j <= high - 1 and j++
            if (array[j].compareToIgnoreCase(pivot) < 0)
            {
                counter.counter += 3;                                   // array[j].compareToIgnoreCase(pivot) < 0
                i++;
                counter.counter += 2;                                   // i++
                swap(array, i, j);
                counter.counter += 8;                                   // calling swap function
            }
        }
        swap(array, i + 1, high);
        counter.counter += 8;                                           // calling swap function
        counter.counter += 2;                                           // return (i + 1)
        return (i + 1);
    }

    static String[] quickSort(String[] array, int low, int high, Counter counter)
    {
        counter.counter++;                                              // low < high
        if (low < high)
        {
            int pivot = partition(array, low, high, counter);
            counter.counter += 2;
            quickSort(array, low, pivot - 1, counter);
            counter.counter += 2;
            quickSort(array, pivot + 1, high, counter);
            counter.counter += 2;
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
        Counter counter = new Counter();
        String[] array = new String[142301];
        readFile(array, "wordList.txt");
        String[] sortedArray = quickSort(array, 0, 142300, counter);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
        System.out.println("Number of primitive operations in quick sort is " + counter.counter);
    }
}
