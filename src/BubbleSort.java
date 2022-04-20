import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) throws FileNotFoundException {
        String[] array = new String[100];
        readFile(array, "wordList100.txt");
        String[] sortedArray = bubbleSort(array, array.length);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(i + 1 + ".\t" + sortedArray[i]);
        }
    }

    public static String[] bubbleSort(String[] array, int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(array[i].compareToIgnoreCase(array[j]) > 0){
                    String temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
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
