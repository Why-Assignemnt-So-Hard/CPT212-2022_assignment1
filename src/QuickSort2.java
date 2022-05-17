import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort2 {
    // main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        ArrayList<String> list = new ArrayList<String>();
        readFile(list, "MYwordList.txt");
        quickSort(list, 0, list.size() - 1, counter);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Number of primitive operations in quick sort size of " + list.size() + " is " + counter.counter);
    }

    // function to swap two elements
    static void swap(ArrayList<String> list, int i, int j)
    {
        String temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // function to determine partitionIns
    static int partition(ArrayList<String> list, int low, int high, Counter counter)
    {
        String pivot = list.get((high + low) / 2);
        counter.counter += 2;                                           // String pivot = list.get(high)
        int i = low - 1;
        counter.counter += 2;                                           // int i = low - 1
        counter.counter += 2;                                           // int j = low + 1
        for(int j = low + 1; j <= high - 1; j++)
        {
            counter.counter += 4;                                       // j <= high - 1 and j++
            if (list.get(j).compareToIgnoreCase(pivot) < 0)
            {
                counter.counter += 3;                                   // list.get(j).compareToIgnoreCase(pivot) < 0
                i++;
                counter.counter += 2;                                   // i++
                swap(list, i, j);
                counter.counter += 6;                                   // calling swap function
            }
        }
        swap(list, i + 1, high);
        counter.counter += 6;                                           // calling swap function
        counter.counter += 2;                                           // return (i + 1)
        return (i + 1);
    }

    // function definition for quick sort
    static void quickSort(ArrayList<String> list, int low, int high, Counter counter)
    {
        counter.counter++;                                              // compare low with high
        if (low < high)
        {
            int pivot = partition(list, low, high, counter);
            counter.counter += 2;                                       // int pivot = partition(list, low, high, counter)
            quickSort(list, low, pivot - 1, counter);
            counter.counter += 2;                                       // quickSort(array, low, pivot - 1, counter)
            quickSort(list, pivot + 1, high, counter);
            counter.counter += 2;                                       // quickSort(array, pivot + 1, high, counter)
        }
    }

    // function to read word from list and pass to array list
    public static void readFile(ArrayList<String> list, String fileName) throws FileNotFoundException {
        int i = 0;
        FileInputStream file = new FileInputStream(fileName);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            list.add(input.nextLine());
            i++;
        }
        input.close();
    }
}