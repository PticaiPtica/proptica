package Map_49_50.Task4;

import javax.swing.tree.TreeNode;
import java.util.Comparator;
import java.util.Map;

public class ComparatorTree_One implements Comparator<Tree> {


    @Override
    public int compare(Tree o1, Tree o2) {
        return o1.getNameTree().compareTo(o2.getNameTree());
    }

}
