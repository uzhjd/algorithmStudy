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

        System.out.println(tree.BFS(0, tree.root));

    }

    public static int BFS(int cnt, Node root) {
        Queue<Node> que = new LinkedList<>();
        int L = 0;
        que.add(root);

        while(!que.isEmpty()) {
            L++;
            int len = que.size();

            for(int i = 0; i < len; i++) {
                Node node = que.poll();

                if(node.lt == null && node.rt == null) return L;
                if(node.lt != null) que.add(node.lt);
                if(node.rt != null) que.add(node.rt);
            }
        }
        return 0;
    }
}