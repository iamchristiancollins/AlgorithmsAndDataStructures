package lab7;

import java.util.*;

public class Graph {

    ArrayList<ArrayList<Integer>> adj;
    ArrayList<Integer> vert, d, pi, f;
    ArrayList<String> col;
    int V;

    Graph(int v){
        this.V = v;
        adj = new ArrayList<>();
        vert = new ArrayList<>();
        d = new ArrayList<>();
        pi = new ArrayList<>();
        col = new ArrayList<>();
        f = new ArrayList<>();
        for (int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
            vert.add(i);
            d.add(Integer.MAX_VALUE);
            pi.add(null);
            f.add(null);
            col.add("white");
        }
    }

    public void addEdge(Integer v, Integer u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public void printGraph(){
        for (int i = 0; i < V; i++){
            if (!adj.get(i).isEmpty()) {
                System.out.print("Vertex " + i);
                for (Integer x : adj.get(i)) System.out.print(" -> " + x);
                System.out.println();
            }
        }
    }

    public void bfs(Graph g, Integer s){
        for (int i = 0; i < V; i++){
            col.set(i, "white");
            d.set(i, Integer.MAX_VALUE);
            pi.set(i, null);
        }
        col.set(s, "gray");
        d.set(s, 0);
        pi.set(s, null);
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()){
            Integer u = q.poll();
            for (Integer v : adj.get(u)){
                if (Objects.equals(col.get(v), "white")){
                    col.set(v, "gray");
                    System.out.println(v + " has been changed to gray");
                    int d2 = d.get(u)+1;
                    d.set(v, d2);
                    pi.set(v, u);
                    q.add(v);
                }
            }
            col.set(u, "black");
            System.out.println(u + " has been changed to black");
        }
    }

    public void printPath(Graph g, int s, int v){
        if (s == v){
            System.out.print(s);
        } else if (pi.get(v) == null){
            System.out.println("No path from " + s + " to " + v);
        } else {
            printPath(g, s, pi.get(v));
            System.out.print(", " + v);
        }
    }

    int time = 0;
    public void dfs(Graph g){
        for (Integer i : vert){
            g.col.set(i, "white");
            g.pi.set(i, null);
        }
        time = 0;
        for (Integer u : vert){
            if (Objects.equals(g.col.get(u), "white")){
                dfsVisit(g, u);
            }
        }
    }

    public void dfsVisit(Graph g, int u){
        time = time + 1;
        g.d.set(u, time);
        g.col.set(u, "gray");
        for (Integer v : adj.get(u)){
            if (Objects.equals(g.col.get(v), "white")){
                g.pi.set(v, u);
                dfsVisit(g, v);
            }
        }
        g.col.set(u, "black");
        time = time + 1;
        g.f.set(u, time);
    }
}
