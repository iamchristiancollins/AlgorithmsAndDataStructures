package labs1and2;

import java.io.FileNotFoundException;
import java.util.Arrays;


public class Driver {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "500000.txt";
        Integer[] arr = TxtReader.readLines(fileName);
        Integer[] temp = arr.clone();
        Integer[] arr2 = arr.clone();

        //labs1and2.Insertion.insertionSort(arr);
        //Merge.mergeSort(arr, temp, 0, arr.length-1);
        long startTime = System.nanoTime();
        Merge.mergeWinsert(arr, temp, 0, arr.length-1);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("sort time for merge w insertion: " + executionTime);

        startTime = System.nanoTime();
        Merge.mergeSort(arr2, temp, 0, arr.length-1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("sort time for normal merge: " + executionTime);

//        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr, arr2));




//        System.out.println("Execution time for " + fileName + ": " + executionTime + " nanoseconds");

    }
}