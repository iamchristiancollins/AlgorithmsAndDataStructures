package lab5;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException {

        Bst tree = new Bst();
        CsvReader reader = new CsvReader();

        reader.readAndCreateTree("UPC.csv", tree);



        long startTime = System.nanoTime();
        tree.inOrderTreeWalk(tree.getRoot());
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time for InOrder Tree Walk: " + executionTime + " nanoseconds");

        System.out.println("*******************");

        ArrayList<Long> arr = reader.read("input.dat");

        startTime = System.nanoTime();
        for (long l : arr){
            Node result = tree.bstSearch(tree.getRoot(), l);
            System.out.println(result.getKey() + "," + result.getSize() + "," + result.getDescription());
        }
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Execution time for Binary Tree Search input.dat: " + executionTime + " nanoseconds");
    }
}
