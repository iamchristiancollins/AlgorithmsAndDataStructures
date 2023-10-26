package lab7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {

    public static Graph read(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(Paths.get(filename).toFile()));
        int v = sc.nextInt();
        Graph g = new Graph(v);
        sc.nextInt();
        while (sc.hasNextLine()){
            if (sc.hasNextInt()) {
                int src = sc.nextInt();
                int dst = sc.nextInt();
                System.out.println("adding " + src + " " + dst);
                g.addEdge(src, dst);
            } else {
                sc.nextLine();
            }
        }
        sc.close();
        return g;
    }
}

