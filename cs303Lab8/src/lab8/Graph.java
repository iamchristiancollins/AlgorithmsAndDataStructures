package lab8;

import java.util.*;
public class Graph {
    private Queue<Vertex> queue;

    private int V, E;
    ArrayList<Vertex> vertArray;

    public Graph(int v){
        this.V = v;
        queue = new LinkedList<Vertex>();
        vertArray = new ArrayList<>(v);
        for (int i = 0; i < v; i++){
            vertArray.add(new Vertex(i));
        }

    }

    public void addEdge(Vertex v, Vertex w){
        vertArray.get(v.getVal()).addAdj(w);
        vertArray.get(w.getVal()).addAdj(v);
    }

    /**toString created with help from
     * https://www.geeksforgeeks.org/graph-representation-using-java-arraylist/#
     * **/
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        int size = vertArray.size();
        for (int i = 0; i < size; i++){
            if (vertArray.get(i).adj.isEmpty()){
                continue;
            }
            builder.append(i).append(": ");
            for (int j = 0; j <vertArray.get(i).adj.size(); j++){
                builder.append(vertArray.get(i).adj.get(j)).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public void bfs(Vertex s) {
        for (Vertex u : vertArray){
            if (!Objects.equals(u.getColor(), "white")){
                u.setColor("white");
                u.setD(Integer.MAX_VALUE);
                u.setPi(null);
            }
        }
        s.setColor("gray");
        s.setD(0);
        s.setPi(null);
        queue.add(s);
        while (!queue.isEmpty()){
            Vertex u = queue.poll();
            for (Vertex v : vertArray.get(u.getVal()).adj){
                if (Objects.equals(v.getColor(), "white")){
                    v.setColor("gray");
                    v.setD(u.getD()+1);
                    v.setPi(u);
                    queue.add(v);
                }
                u.setColor("black");
            }
        }
    }

    public void printPath(Vertex s, Vertex v){
        if (Objects.equals(s, v)){
            System.out.print(s.toString() + " ");
        } else if (v.getPi() == null) {
            System.out.print("No path from " + s.toString() + " to " + v + " ");
        } else {
            printPath(s, v.getPi());
            System.out.print(v + " ");
        }
    }
    int time = 0;
    public void dfs(){
        for (Vertex u : vertArray){
            u.setColor("white");
            u.setPi(null);
        }
        time = 0;
        for (Vertex u : vertArray){
            if (Objects.equals(u.getColor(), "white")){
                dfsVisit(u);
            }
        }
    }

    public void dfsVisit(Vertex u){
        time = time + 1;
        u.setD(time);
        u.setColor("gray");
        for (Vertex v : vertArray.get(u.getVal()).adj){
            if (Objects.equals(v.getColor(), "white")){
                v.setPi(u);
                dfsVisit(v);
            }
        }
        u.setColor("black");
        time = time + 1;
        u.setF(time);
    }

    public Queue<Vertex> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Vertex> queue) {
        this.queue = queue;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }


}