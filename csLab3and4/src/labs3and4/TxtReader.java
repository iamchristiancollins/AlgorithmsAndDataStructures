package labs3and4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtReader {
    public static Integer[] readLines(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(Paths.get(filename).toFile())).useDelimiter(",");
        List<Integer> words = new ArrayList<>();
        int word;
        while (sc.hasNextInt()) {
            word = sc.nextInt();
            words.add(word);
        }
        sc.close();
        return words.toArray(new Integer[0]);
    }
}
