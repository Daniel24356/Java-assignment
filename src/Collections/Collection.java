package Collections;

public class Collection {
    private String budget;
    private int price;

    public Collection(String task, int price) {
        this.budget = task;
        this.price = price;
    }

    public String getTask() {
        return budget;
    }

    public void setTask(String budget) {
        this.budget = budget;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "task='" + budget + '\'' +
                ", price=" + price +
                '}';
    }
}
