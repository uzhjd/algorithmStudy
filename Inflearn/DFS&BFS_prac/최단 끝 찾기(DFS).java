import java.util.*;

public class Main {

    static int min = 10001;
    Node root;

    public class Node {
        int root;
        Node lt;
        Node rt;

        public Node(int val) {
            root = val;
            lt = rt = null;
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));

    }

    public static int DFS(int cnt, Node root) {
        if(root.lt == null && root.rt == null) return cnt;
        else return Math.min(DFS(cnt + 1, root.lt), DFS(cnt + 1, root.rt));
    }
}