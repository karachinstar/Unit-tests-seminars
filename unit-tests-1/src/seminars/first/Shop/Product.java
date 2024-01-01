package src.seminars.first.Shop;

public class Product {
    private Integer cost; // Стоимость продукта
    private String title; // Название
    public Product(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}