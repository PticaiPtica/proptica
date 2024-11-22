package Map_49_50.Task4;

import java.util.Comparator;

public class ComparatorTree_Two implements Comparator<Tree> {
    @Override
    public int compare(Tree o1, Tree o2) {
        return o1.getHeightTree() - o2.getHeightTree();
    }
}
