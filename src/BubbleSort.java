import java.io.*;
import java.util.*;

public class BubbleSort {
    //main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        String[] array = new String[142301];
        readFile(array, "wordList.txt");
        String[] sortedArray = bubbleSort(array, array.length, counter);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
        System.out.println("Number of primitive operations in bubble sort is " + counter.counter);
    }

    //function definition for bubble sort
    public static String[] bubbleSort(String[] array, int n, Counter counter){
        counter.counter = 1;                //int i = 0
        for(int i = 0; i < n; i++){
            counter.counter += 3;           //i < n and i++
            counter.counter += 2;           //int j = i + 1
            for(int j = i + 1; j < n; j++){
                counter.counter += 3;       //j < n and j++
                counter.counter += 3;       //comparing array[i] with array[j]
                if(array[i].compareToIgnoreCase(array[j]) > 0){
                    String temp = array[i];
                    counter.counter += 2;   //String temp = array[i]
                    array[i]=array[j];
                    counter.counter += 3;   //array[i]=array[j]
                    array[j]= temp;
                    counter.counter += 2;   //array[j]= temp
                }
            }
        }
        counter.counter++;                  //return array
        return array;
    }

    //function to read word from list and pass to array
    public static String[] readFile(String[] array, String fileName) throws FileNotFoundException {
        int i = 0;
        FileInputStream file = new FileInputStream(fileName);
        Scanner input = new Scanner(file);
        while(input.hasNextLine())
        {
            array[i] = input.nextLine();
            i++;
        }
        input.close();
        return array;
    }
}
