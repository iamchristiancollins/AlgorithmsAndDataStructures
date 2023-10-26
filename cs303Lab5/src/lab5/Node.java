package lab5;

public class Node {
    private long key;
    private Node left, right, parent;
    private String description, size;

    public Node(long key, String size, String description){
        this.key = key;
        left = right = parent = null;
        this.size = size;
        this.description = description;
    }

    public Node(long key){
        this.key = key;
        left = right = null;
        this.size = null;
        this.description = null;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
