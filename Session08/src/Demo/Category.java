package Demo;

import java.util.Random;

public class Category {
    private int id;
    private String categoryName;
    private String description;

    Random rand = new Random();

    public Category(String categoryName, String description) {
        this.id = (int) System.currentTimeMillis();
        this.categoryName = categoryName;
        this.description = description;

    }

    @Override
    public String toString() {
        return "[ " + id + " ]" + " " + categoryName + " " + description;
    }
}
