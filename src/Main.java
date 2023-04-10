import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(-5);
        tree.add(100);
        tree.add(-78);
        tree.add(99);
        tree.add(110);
        tree.add(103);

        List<Integer> dfsOrderItems = new ArrayList<>();
        tree.dfs(dfsOrderItems::add);
        System.out.println(dfsOrderItems);

        System.out.println(tree.findLast());
        System.out.println(tree.getChildrenCount());
    }
}