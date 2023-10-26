package lab5;

public class Bst {
    private Node root;

    public Bst(){
        root = null;
    }

    public void insert(Node node) {
        Node y = null;
        Node x = this.getRoot();
        while (x != null){
            y = x;
            if (node.getKey() < x.getKey()){
               x = x.getLeft();
            }else{
                x = x.getRight();
            }
        }

        node.setParent(y);
        if (y == null){
            this.setRoot(node);
        } else if (node.getKey() < y.getKey()){
            y.setLeft(node);
        } else {
            y.setRight(node);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node bstSearch(Node x, long k){
        if (x == null || k == x.getKey()){
            return x;
        } if (k < x.getKey()){
            return bstSearch(x.getLeft(), k);
        } else {
            return bstSearch(x.getRight(), k);
        }
    }
    long counter = 0;
    public void inOrderTreeWalk(Node x){
        if (x != null){
            inOrderTreeWalk(x.getLeft());
            if (x.getDescription() != null){
                System.out.println(x.getKey() + ": " + x.getDescription());
            } else {
                System.out.println(x.getKey());
            }
            inOrderTreeWalk(x.getRight());
        }
    }

}
