package Map_49_50.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Tree treeOsina = new Tree.Builder().
                name("Осина").
                heightTree(13).
                build();


        Tree treeSosna = new Tree.Builder().
                name("Сосна").
                heightTree(10).
                build();


        Tree treeOreh = new Tree.Builder().
                name("Орех").
                heightTree(15).
                build();


        System.out.println(treeOsina);
        System.out.println(treeSosna);
        System.out.println(treeOreh);

        ArrayList<Tree> setTree = new ArrayList<>();
        setTree.add(treeSosna);
        setTree.add(treeOreh);
        setTree.add(treeOsina);

        System.out.println(setTree);

        Comparator comparatorOne = new ComparatorTree_One();
        Collections.sort(setTree, comparatorOne);
        System.out.println(setTree);

        Comparator comparatorTwo = new ComparatorTree_Two();
        Collections.sort(setTree, comparatorTwo);
        System.out.println(setTree);


    }
}
