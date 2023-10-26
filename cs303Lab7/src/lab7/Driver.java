package lab7;

import java.io.FileNotFoundException;

public class Driver {

    public static void main(String[] args) throws FileNotFoundException {

        String filename = "mediumG-1.txt";

        long startTime = System.nanoTime();
        Graph g = Reader.read(filename);
        long endTime = System.nanoTime();
        long exec = endTime - startTime;
        System.out.println("Graph construction time: " + exec);

        startTime = System.nanoTime();
        g.bfs(g, 0);
        endTime = System.nanoTime();
        exec = endTime - startTime;
        System.out.println("BFS time " + exec);


        int start = 0;
        int end = 239;

//        System.out.println("Path from " + start + " to " + end + ":");
//        startTime = System.nanoTime();
//        g.printPath(g, start, end);
//        System.out.println();
//        endTime = System.nanoTime();
//        exec = endTime - startTime;
//        System.out.println("BFS printPath time " + exec);

//        startTime = System.nanoTime();
        g.dfs(g);
//        endTime = System.nanoTime();
//        exec = endTime - startTime;
//        System.out.println("DFS time " + exec);

        System.out.println("Path from " + start + " to " + end + ":");
//        startTime = System.nanoTime();
        for (int i = 0; i < g.V; i++){
            end = i;
            System.out.print(start + " to " + end + ": ");
            g.printPath(g, start, end);
            System.out.println();
        }
//        System.out.println();
//        endTime = System.nanoTime();
//        exec = endTime - startTime;
//        System.out.println("DFS printPath time " + exec);

    }
}
