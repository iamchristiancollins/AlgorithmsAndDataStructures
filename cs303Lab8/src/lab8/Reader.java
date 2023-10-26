package lab8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {

    public static Graph read(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(Paths.get(filename).toFile()));
        int v = sc.nextInt();
        Graph graph = new Graph(v);
        graph.setE(sc.nextInt());
        while (sc.hasNextLine()){
            if (sc.hasNextInt()) {
                int source = sc.nextInt();
                int destination = sc.nextInt();
                double w = sc.nextDouble();
                graph.addEdge(graph.vertArray.get(source), graph.vertArray.get(destination));
            } else {
                sc.nextLine();
            }
        }
        sc.close();
        return graph;
    }
}
