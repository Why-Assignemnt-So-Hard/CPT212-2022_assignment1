import java.io.*;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) throws FileNotFoundException {
        String[] array = new String[100];
        readFile(array, "wordList100.txt");
        String[] sortedArray = insertionSort(array, array.length);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(i + 1 + ".\t" + sortedArray[i]);
        }
    }

    public static String[] insertionSort(String[] array, int n) {
        for (int i = 1; i < n; ++i) {
            String key = array[i];
            int j = i - 1;
            while (j >= 0 && array[i].compareToIgnoreCase(array[j]) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
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
}
