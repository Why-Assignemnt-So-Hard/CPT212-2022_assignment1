import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort2 {
    // main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        ArrayList<String> list = new ArrayList<String>();
        readFile(list, "wordList.txt");
        insertionSort(list, list.size(), counter);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Number of primitive operations in insertion sort is " + counter.counter);
    }

    // function definition for insertion sort
    public static void insertionSort(ArrayList<String> list, int n, Counter counter) {
        counter.counter = 1;            // int i = 1
        for (int i = 1; i < n; ++i) {
            counter.counter += 3;       // i < n and ++i
            String key = list.get(i);
            counter.counter += 2;       // String key = list.get(i)
            int j = i - 1;
            counter.counter += 2;       // int j = i - 1
            while (j >= 0 && list.get(j).compareToIgnoreCase(key) > 0) {
                counter.counter += 5;   // comparing ArrayList[i] with ArrayList[j], j >= 0 and &&
                list.set(j + 1, list.get(j));
                counter.counter += 3;   // list.set(j + 1, list.get(j))
                j = j - 1;
                counter.counter += 2;   // j = j - 1
            }
            list.set(j + 1, key);
            counter.counter += 3;       // list.set(j + 1, key)
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

