public class Product {
    private String name;
    private String category;
    private String currency="USD";
    private int code;
    private int price;

    public Product(String name, String category, int code, int price){
        this.name = name;
        this.category = category;
        this.code = code;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", currency='" + currency + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }
}
