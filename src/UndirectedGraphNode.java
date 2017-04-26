import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘灿锐 on 2017/4/26 0026.
 * Definition for undirected graph.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }
}
