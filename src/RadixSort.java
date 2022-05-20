import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RadixSort {
    //main function
    public static void main(String[] args) throws FileNotFoundException {
        Counter counter = new Counter();
        ArrayList<String> list = new ArrayList<String>();
        readFile(list, "D:\\Y 2 S 2\\CPT212\\Assignment1\\CPT212-2022_assignment1\\wordList.txt");
        int max = getMaxCharacters(list, list.size());

        for (int index = max - 1; index >= 0; --index) {
            countingSort(list, list.size(), index, counter);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Number of primitive operations in bubble sort is " + counter.counter);
    }

    // Function to get the largest number of characters in a string from stringData array
    public static int getMaxCharacters(ArrayList<String> list, int size) {
        //Initializing the length of first string in array as the largest number of characters in a string
        int maxCharac = list.get(0).length();
        for (int i = 1; i < size; i++)
            if (list.get(i).length() > maxCharac)
                maxCharac = list.get(i).length();
        return maxCharac;
    }

    public static void countingSort(ArrayList<String> list, int size, int index, Counter counter) {

        // Declare a temporary array to store the sorted output
        counter.counter += 1;           // String[] output = new String[size+1]
        String[] output = new String[size+1];

        // Declare an array to count the list in the bucket
        counter.counter += 1;           // int[] count = new int[144697]
        int[] count = new int[144697];

        // Set count to 0
        counter.counter += 1;           // i = 0
        for(int i = 0; i < 144697;i++) {
            counter.counter += 3;       // i < 144697 and i++
            count[i] = 0;
            counter.counter += 2;       // count[i] = 0
        }
        counter.counter += 2;           // i = 144697 and exit for loop

        // Calculate the number of elements
        counter.counter += 1;           // i = 0
        for(int i = 0; i < size; i++){
            counter.counter += 3;       // i < size and i++

            // Add the elements into the respective bucket based on the characters
            counter.counter += 4;       // list.get(i).length() - 1 >= index
            if(list.get(i).length() - 1 >= index){
                count[list.get(i).charAt(index)] += 1;
                counter.counter += 5;   // count[list.get(i).charAt(index)] += 1
            }else{
                count[0] += 1;
                counter.counter += 3;   // count[0] += 1
            }
        }
        counter.counter += 2;            // i = size and exit for loop


        // Calculate the cumulative count of the bucket and store into the same array
        counter.counter += 1;           // i = 1
        for(int i = 1; i < 144697; i++){
            counter.counter += 3;       // i < 144697 and i++
            count[i] += count[i-1];
            counter.counter += 5;       // count[i] += count[i-1]
        }
        counter.counter += 2;           // i = 144697 and exit for loop

        // Place the elements in sorted order
        counter.counter += 2;           // i = size - 1
        for (int i = size - 1; i >= 0; i--) {
            counter.counter += 3;       // i >= 0 and i--
            counter.counter += 5;       // list.get(i).length() - 1 >= index
            if(list.get(i).length() - 1 >= index){
                output[(count[list.get(i).charAt(index)]-1)] = list.get(i);
                count[list.get(i).charAt(index)]--;
                counter.counter += 12;
            }else{
                output[count[0]-1] = list.get(i);
                count[0]--;
                counter.counter += 5;   // output[count[0]-1] = list.get(i)
                counter.counter += 3;   // count[0]--
            }
        }
        counter.counter += 2;           // i = -1 and exit for loop

        // Move the array from temporary array into the original array
        counter.counter += 1;           // i = 0
        for (int i = 0; i < size; i++){
            counter.counter += 3;       // i < size and i++
            list.set(i, output[i]);
            counter.counter += 2;       // list.set(i, output[i])
        }
        counter.counter += 2; // i = size and exit for loop
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


