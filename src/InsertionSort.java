import java.io.*;
import java.util.*;

public class InsertionSort {
    //main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        String[] array = new String[100];
        readFile(array, "wordList100.txt");
        String[] sortedArray = insertionSort(array, array.length, counter);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
        System.out.println("Number of primitive operations in insertion sort is " + counter.counter);
    }

    //function definition for insertion sort
    public static String[] insertionSort(String[] array, int n, Counter counter) {
        counter.counter = 1;            //int i = 1
        for (int i = 1; i < n; ++i) {
            counter.counter += 3;       //i < n and ++i
            String key = array[i];
            counter.counter += 2;       //String key = array[i]
            int j = i - 1;
            counter.counter += 2;       //int j = i - 1
            while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
                counter.counter += 5;   //1. comparing array[i] with array[j]
                                        //2. j >= 0
                                        //3. &&
                array[j + 1] = array[j];
                counter.counter += 4;   //comparing array[j+1] with array[j]
                j = j - 1;
                counter.counter += 2;   //j = j - 1
            }
            array[j + 1] = key;
            counter.counter += 3;       //array[j + 1] = key
        }
        counter.counter++;              //return array
        return array;
    }

    //function to read word from list and pass to array
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
}
