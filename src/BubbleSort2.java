import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort2 {
    // main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        ArrayList<String> list = new ArrayList<String>();
        readFile(list, "wordList.txt");
        bubbleSort(list, list.size(), counter);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Number of primitive operations in bubble sort is " + counter.counter);
    }

    // function definition for bubble sort
    public static void bubbleSort(ArrayList<String> list, int n, Counter counter){
        counter.counter = 1;                // int i = 0
        for(int i = 0; i < n; i++){
            counter.counter += 3;           // i < n and i++
            counter.counter += 2;           // int j = i + 1
            for(int j = i + 1; j < n; j++){
                counter.counter += 3;       // j < n and j++
                counter.counter += 4;       // comparing ArrayList[i] with ArrayList[j]
                if(list.get(i).compareToIgnoreCase(list.get(j)) > 0){
                    String temp = list.get(i);
                    counter.counter += 2;   // String temp = list.get(i)
                    list.set(i, list.get(j));
                    counter.counter += 2;   // list.set(i, list.get(j))
                    list.set(j, temp);
                    counter.counter += 2;   // list.set(j, temp)
                }
            }
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
