package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CsvReader {
    public void readAndCreateTree(String filename, Bst tree) throws FileNotFoundException {
        ArrayList<Node> nodeArr = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            //idea of splitting from https://stackoverflow.com/questions/26285086/reading-a-string-int-and-double-from-csv-file
            String[] splitLine = line.split(",");
            long key = Long.parseLong(splitLine[0]);
            String size = splitLine[1];
            String description = splitLine[2];
            Node node = new Node(key, size, description);
            nodeArr.add(node);
        }
        sc.close();
        Collections.shuffle(nodeArr);
        for (Node node: nodeArr){
            tree.insert(node);
        }
    }

    public ArrayList<Long> read(String filename) throws FileNotFoundException {
        ArrayList<Long> arr = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] splitLine = line.split(",");
            long key = Long.parseLong(splitLine[0]);
            arr.add(key);
        }
        return arr;
    }

}
