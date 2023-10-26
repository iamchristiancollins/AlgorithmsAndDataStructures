package lab8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {

    ArrayList<Vertex> adj;
    private String color;
    private int d, val, f;
    Vertex pi;



    public Vertex(int val){
        this.color = "white";
        this.val = val;


    }

    public void addAdj(Vertex v){
        if (this.adj == null){
            this.adj = new ArrayList<>();
            this.adj.add(v);
        } else {
            this.adj.add(v);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Vertex getPi() {
        return pi;
    }

    public void setPi(Vertex pi) {
        this.pi = pi;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString(){
        return String.valueOf(this.getVal());
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

}

