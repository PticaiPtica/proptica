package Map_49_50.Task4;

import Task.Task;

import java.util.Comparator;
import java.util.Objects;


public class Tree  {
    private String NameTree;
    private Integer HeightTree;

    public Tree(String nameTree, Integer heightTree) {
        this.NameTree = nameTree;
        this.HeightTree = heightTree;
    }

    public String getNameTree() {
        return NameTree;
    }

    public void setNameTree(String nameTree) {
        this.NameTree = nameTree;
    }

    public Integer getHeightTree() {
        return HeightTree;
    }

    public void setHeightTree(Integer heightTree) {
        this.HeightTree = heightTree;
    }

    public Tree(Builder builder) {
        NameTree = builder.NameTree;
        HeightTree = builder.HeightTree;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(NameTree, tree.NameTree) && Objects.equals(HeightTree, tree.HeightTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameTree, HeightTree);
    }

    public static class Builder {
        private String NameTree;
        private Integer HeightTree;


        public Builder() {

        }


        /**
         * Название дерева
         * @param name
         */
        public Builder name(String name) {
            NameTree = name;
            return this;
        }

        /**
         * Высота дерева
         * @param heightTree
         */
        public Builder heightTree(Integer heightTree) {
            HeightTree = heightTree;
            return this;
        }

        public Tree build() {
            return new Tree(this);
        }

    }

    @Override
    public String toString() {
        return STR."Tree{ дерево \{NameTree}, Высота = \{HeightTree}}";
    }

}
