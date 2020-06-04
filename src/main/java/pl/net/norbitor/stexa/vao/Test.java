package pl.net.norbitor.stexa.vao;

import java.util.List;

public class Test {
    private final String title;
    private final List<Category> categories;
    private final int availableTime;

    public Test(String title, List<Category> categories, int availableTime) {
        this.title = title;
        this.categories = categories;
        this.availableTime = availableTime;
    }

    public String getTitle() {
        return title;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public int getAvailableTime() {
        return availableTime;
    }
}
