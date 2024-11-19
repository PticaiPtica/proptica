package Task;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String Name;
    private Integer priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.Name = name;
        this.priority = priority;
        this.category = category;
    }

    public Task(Builder builder) {
        Name = builder.Name;
        priority = builder.Priority;
        category = builder.Category;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static class Builder {
        private String Name;
        private Integer Priority;
        private String Category;

        public Builder() {

        }


        public Builder name(String name) {
            Name = name;
            return this;
        }

        public Builder priority(Integer priority) {
            Priority = priority;
            return this;
        }

        public Builder category(String category) {
            Category = category;
            return this;

        }

        public Task build() {
            return new Task(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(Name, task.Name) && Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, priority, category);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + Name + '\'' +
                ", priority = " + priority +
                ", category = '" + category + '\'' +
                '}';
    }


    @Override
    public int compareTo(Task o) {
        int intPriority = this.priority.compareTo(o.priority);
        int intCategory = this.category.compareTo(o.category);

        if (intPriority != 0) {
            return intPriority;
        }
        return intCategory;


    }
}
