package labs3and4;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {

        String filename = "1000.txt";
        Integer[] arr = TxtReader.readLines(filename);
        Integer[] arr2 = arr.clone();
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr, arr2));

        long startTime = System.nanoTime();

        Algorithms.quickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "2500.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "5000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "10000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "25000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "50000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "100000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "250000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");

        filename = "500000.txt";
        arr = TxtReader.readLines(filename);
        startTime = System.nanoTime();
        Algorithms.quickSort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for " + filename + ": " + executionTime + " nanoseconds");


//        Algorithms.quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

    }
}
